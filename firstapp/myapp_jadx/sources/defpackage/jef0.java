package defpackage;

import android.R;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public enum jef0 {
    /* JADX INFO: Fake field, exist only in values array */
    Cut(R.string.cut, R.attr.actionModeCutDrawable, kef0.a),
    /* JADX INFO: Fake field, exist only in values array */
    Copy(R.string.copy, R.attr.actionModeCopyDrawable, kef0.b),
    /* JADX INFO: Fake field, exist only in values array */
    Paste(R.string.paste, R.attr.actionModePasteDrawable, kef0.c),
    /* JADX INFO: Fake field, exist only in values array */
    SelectAll(R.string.selectAll, R.attr.actionModeSelectAllDrawable, kef0.d),
    d(Build.VERSION.SDK_INT <= 26 ? com.sportybet.android.gp.tz.R.string.autofill : R.string.autofill, 0, kef0.e);

    public final Object a;
    public final int b;
    public final int c;

    jef0(int i, int i2, Object obj) {
        this.a = obj;
        this.b = i;
        this.c = i2;
    }
}
