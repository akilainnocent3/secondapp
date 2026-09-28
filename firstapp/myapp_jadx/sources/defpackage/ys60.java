package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public final class ys60 {
    public final Object a;

    public ys60(yb00 yb00Var) {
        yb00Var.getClass();
        this.a = yb00Var;
    }

    public File a() {
        return new File(((Context) this.a).getFilesDir(), "winning_popup_sound.mp3");
    }

    public ys60(Context context) {
        this.a = context;
    }
}
