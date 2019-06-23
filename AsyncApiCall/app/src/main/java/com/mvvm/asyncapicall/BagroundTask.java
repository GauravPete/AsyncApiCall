package com.mvvm.asyncapicall;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Button;
import android.widget.TextView;

public class BagroundTask extends AsyncTask<Void, Void, Void> {

    // create the constructor for getting the ui component
    Context context;
    TextView displayData;
    Button getData;

    public BagroundTask(Context context, TextView displayData, Button getData) {
        this.context = context;
        this.displayData = displayData;
        this.getData = getData;
    }

    // Step 3: This task extends with the AsyncTasl which have Three generice type
    /*
     * 1.
     * 2.
     * 3.
     *
     * */
    // Step 4: override the 4 method but doInBaground method is compulsury, and remening 3 are optional


    @Override
    protected Void doInBackground(Void... voids) {
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
    }
}
