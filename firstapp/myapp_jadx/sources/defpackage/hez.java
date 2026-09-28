package defpackage;

import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class hez {
    public static double a(TextView textView, int i, String str, int i2) {
        return Double.parseDouble(str.substring(i2, textView.getText().toString().length() - i));
    }
}
