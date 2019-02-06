package com.next.sheharyar.gpa;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.next.sheharyar.gpa.Model.GetValuesForGpaFromEdtText;

public class MainActivity extends AppCompatActivity {

    TextView textGpa;
    EditText edtClassOneNum, edtClassOneGrade, edtClassTwoNum, edtClassTwoGrade, edtClassThreeNum, edtClassThreeGrade, edtClassFourNum, cedtClassFourGrade;
    Button calculateGpaStudent;

    //    EditText one, two, thr, fou, fiv, six, sev, eig;
//    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textGpa = (TextView) findViewById(R.id.currentGpa);
        edtClassOneNum = (EditText) findViewById(R.id.edtClassOneNum);
        edtClassTwoNum = (EditText) findViewById(R.id.edtClassTwoNum);
//        edtClassThreeNum = (EditText) findViewById(R.id.edtClassThreeNum);
//        edtClassFourNum = (EditText) findViewById(R.id.edtClassFourNum);
        edtClassOneGrade = (EditText) findViewById(R.id.edtClassOneGrade);
        edtClassTwoGrade = (EditText) findViewById(R.id.edtClassTwoGrade);
//        edtClassThreeGrade = (EditText) findViewById(R.id.edtClassThreeGrade);
//        cedtClassFourGrade = (EditText) findViewById(R.id.edtClassFourGrade);

        calculateGpaStudent = (Button) findViewById(R.id.btnCalculateGpa);

        showGpaResult();

    }


//    public void cGpaMethod(){
//        //hiding the keyboard after typing
//        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
//        imm.hideSoftInputFromWindow(eig.getWindowToken(), 0);
//
//        try {
//            int tot_credit = 0;//=27+29+30+30+30+30;
//            String a = sev.getText().toString();
//            float se = Float.parseFloat(a);
//            if (se != 0) {
//                tot_credit += 30;
//            }
//            String b = eig.getText().toString();
//            float ei = Float.parseFloat(b);
//            if (ei != 0) {
//                tot_credit += 30;
//            }
//            String c = one.getText().toString();
//            float on = Float.parseFloat(c);
//            if (on != 0) {
//                tot_credit += 27;
//            }
//            String d = two.getText().toString();
//            float tw = Float.parseFloat(d);
//            if (tw != 0) {
//                tot_credit += 29;
//            }
//            String e = thr.getText().toString();
//            float th = Float.parseFloat(e);
//            if (th != 0) {
//                tot_credit += 30;
//            }
//            String f = fou.getText().toString();
//            float fo = Float.parseFloat(f);
//            if (fo != 0) {
//                tot_credit += 30;
//            }
//            String g = fiv.getText().toString();
//            float fi = Float.parseFloat(g);
//            if (fi != 0) {
//                tot_credit += 30;
//            }
//            String h = six.getText().toString();
//            float si = Float.parseFloat(h);
//            if (si != 0) {
//                tot_credit += 30;
//            }
//            float sgpa;
//            sgpa = on * 27 + tw * 29 + th * 30 + fo * 30 + fi * 30 + si * 30 + se * 30 + ei * 30;
//            float cgpa;
//            cgpa = sgpa / tot_credit;
//            String cg = "CGPA=" + String.valueOf(cgpa);
//            txt.setText(cg);
//            Toast.makeText(MainActivity.this, "Your CGPA is " + cgpa, Toast.LENGTH_LONG).show();
//        } catch (NumberFormatException e) {
//            Toast.makeText(MainActivity.this, "Sorry, Inputs cannot be empty!", Toast.LENGTH_SHORT).show();
//        }
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.id_clear) {
            edtClassOneNum.setText("");
            edtClassOneGrade.setText("");
            edtClassTwoNum.setText("");
            edtClassTwoGrade.setText("");
//            edtClassThreeNum.setText("");
//            edtClassThreeGrade.setText("");
//            edtClassFourNum.setText("");
//            cedtClassFourGrade.setText("");
            return true;
        }
        if (id == R.id.id_exit) {
            new AlertDialog.Builder(this)
                    .setMessage("Are you sure you want to exit?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            MainActivity.this.finish();
                        }
                    })
                    .setNegativeButton("No", null)
                    .show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    private void showGpaResult() {

        calculateGpaStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String edtTextClassOne = edtClassOneNum.getText().toString();
                String edtTextClassOneGrade = edtClassOneGrade.getText().toString();
                String edtTextClassTwo = edtClassTwoNum.getText().toString();
                String edtTextclassTwoGrade = edtClassTwoGrade.getText().toString();
//                String edtTextClassThree = edtClassThreeNum.getText().toString();
//                String edtTextClassThreeGrade = edtClassThreeGrade.getText().toString();
//                String edtTextClassFour = edtClassFourNum.getText().toString();
//                String edtTextFourGrade = cedtClassFourGrade.getText().toString();

                GetValuesForGpaFromEdtText getValues = new GetValuesForGpaFromEdtText(edtTextClassOne, edtTextClassOneGrade, edtTextClassTwo, edtTextclassTwoGrade);
                getValues.setGetValueEditOne(edtTextClassOne);
                getValues.setGetValueEditTwo(edtTextClassOneGrade);
                getValues.setGetValueEditThree(edtTextClassTwo);
                getValues.setGetValueEditFour(edtTextclassTwoGrade);
//                getValues.setGetValueEditFive(edtTextClassThree);
//                getValues.setGetValueEditSix(edtTextClassThreeGrade);
//                getValues.setGetValueEditSeven(edtTextClassFour);
//                getValues.setGetValueEditEight(edtTextFourGrade);

//                GpaSimulator gpaCalulatorSimulator = new GpaSimulator(edtTextClassOne, edtTextClassTwo, edtTextClassThree, edtTextClassFour, edtTextClassOneGrade,
//                        edtTextclassTwoGrade, edtTextClassThreeGrade, edtTextFourGrade);

                GpaSimulator gpaCalulatorSimulator = new GpaSimulator(edtTextClassOne, edtTextClassOneGrade, edtTextClassTwo, edtTextclassTwoGrade);

                gpaCalulatorSimulator.checkClassOneGradesToShowGpa();
                gpaCalulatorSimulator.checkClassTwoGradesToShowGpa();
                gpaCalulatorSimulator.checkClassThreeGradesToShowGpa();
                gpaCalulatorSimulator.checkClassFourGradesToShowGpa();

                int pointsTotal1 = (int) gpaCalulatorSimulator.getTotalForClassOne();
                int pointsTotal2 = (int) gpaCalulatorSimulator.getTotalForClassTwo();
                int pointsTotal3 = (int) gpaCalulatorSimulator.getTotalForClassThree();
                int pointsTotal4 = (int) gpaCalulatorSimulator.getTotalForClassFour();

                int Credits = (int) gpaCalulatorSimulator.addAllTotalCredits(pointsTotal1);
                int PintsTotal = (int) gpaCalulatorSimulator.addAllTotalPoints(pointsTotal1);

                double totalPoints = pointsTotal1 + pointsTotal2 + pointsTotal3 + pointsTotal4;
//                double test = Credits + PintsTotal;

                double result =  totalPoints / Credits;

                textGpa.setText("Gpa is : " + result);


            }
        });
    }
}
