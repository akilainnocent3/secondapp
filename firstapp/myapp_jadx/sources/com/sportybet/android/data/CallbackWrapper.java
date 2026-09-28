package com.sportybet.android.data;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import defpackage.bi50;
import defpackage.gv5;
import defpackage.su5;
import defpackage.xsb;
import defpackage.zsb;
import java.lang.ref.WeakReference;
import okhttp3.Request;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes5.dex */
public class CallbackWrapper<T> implements gv5<T> {
    private static final xsb crashlyticsHelperEntryPointDelegate = new zsb();
    private WeakReference<Activity> activity;
    private ResponseBody errorBody;
    private WeakReference<Fragment> fragment;
    private boolean isRawResponseSuccessful;
    private Request request;

    public CallbackWrapper(Fragment fragment) {
        this.fragment = new WeakReference<>(fragment);
    }

    private void processData(su5<T> su5Var, bi50<T> bi50Var) {
        this.request = su5Var.request();
        if (bi50Var != null) {
            this.isRawResponseSuccessful = bi50Var.a.getIsSuccessful();
            this.errorBody = bi50Var.c;
        }
        onResponse();
    }

    private void sendCustomException(su5<T> su5Var, Exception exc) {
        try {
            crashlyticsHelperEntryPointDelegate.c().g("Error in " + su5Var.request().url(), su5Var.request().toString(), exc, null);
        } catch (Exception unused) {
        }
    }

    public ResponseBody getErrorBody() {
        return this.errorBody;
    }

    public String getPath() {
        Request request = this.request;
        return request != null ? request.url().encodedPath() : "";
    }

    public boolean isRawResponseSuccessful() {
        return this.isRawResponseSuccessful;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<T> su5Var, Throwable th) {
        if (stopProgressResponse(su5Var)) {
            return;
        }
        processData(su5Var, null);
        onResponseFailure(th);
        onResponseComplete();
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<T> su5Var, bi50<T> bi50Var) {
        T t;
        if (stopProgressResponse(su5Var)) {
            return;
        }
        processData(su5Var, bi50Var);
        if (!this.isRawResponseSuccessful || (t = bi50Var.b) == null) {
            onResponseFailure(null);
        } else {
            try {
                onResponseSuccess(t);
            } catch (Exception e) {
                onResponseFailure(e);
                sendCustomException(su5Var, e);
            }
        }
        onResponseComplete();
    }

    public void onResponseComplete() {
    }

    public void onResponseFailure(Throwable th) {
    }

    public void onResponseSuccess(T t) {
    }

    public boolean stopProgressResponse(su5<T> su5Var) {
        if (su5Var.isCanceled()) {
            return true;
        }
        WeakReference<Fragment> weakReference = this.fragment;
        if (weakReference != null) {
            Fragment fragment = weakReference.get();
            return fragment == null || fragment.getActivity() == null || fragment.getActivity().isFinishing() || fragment.isDetached();
        }
        WeakReference<Activity> weakReference2 = this.activity;
        if (weakReference2 == null) {
            return false;
        }
        Activity activity = weakReference2.get();
        return activity == null || activity.isFinishing();
    }

    public CallbackWrapper() {
    }

    public CallbackWrapper(Activity activity) {
        this.activity = new WeakReference<>(activity);
    }

    public void onResponse() {
    }
}
