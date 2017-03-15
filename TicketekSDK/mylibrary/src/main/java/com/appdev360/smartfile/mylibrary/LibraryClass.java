package com.appdev360.smartfile.mylibrary;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by usman on 3/15/17.
 */

public class LibraryClass {
    public LibraryClass() {
    }

    public void showToast(Context mContext) {
        Toast.makeText(mContext, "In Library", Toast.LENGTH_SHORT).show();
        mContext.startActivity(new Intent(mContext, LibActivity.class));
    }
}
