//package com.huawei.hms.finaapplication;
//import android.content.Context;
//
//public class DialogManager {
//    private static DialogManager dialogManager = new DialogManager();
//    private LoadingDialog loadingDialog;
//    public static DialogManager newInstance() {
//        return dialogManager;
//    }
//
//    public void showDialog(Context context) {
//        if (null == loadingDialog) {
//            loadingDialog = new LoadingDialog(context);
//        }
//        loadingDialog.show();
//    }
//
//    public void showDialog(Context context, String name) {
//        if (null == loadingDialog) {
//            loadingDialog = new LoadingDialog(context);
//            loadingDialog.setText(name);
//        }
//        loadingDialog.show();
//    }
//
//    public void dismissDialog() {
//        if (loadingDialog != null) {
//            loadingDialog.dismiss();
//            loadingDialog = null;
//        }
//    }
//}
