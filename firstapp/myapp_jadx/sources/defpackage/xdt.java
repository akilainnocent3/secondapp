package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class xdt<T> implements cpc<T> {
    public final boolean a;
    public final Uri b;
    public final ContentResolver c;
    public T d;

    public xdt(ContentResolver contentResolver, Uri uri, boolean z) {
        this.c = contentResolver;
        this.b = uri;
        this.a = z;
    }

    @Override // defpackage.cpc
    public final void b() {
        T t = this.d;
        if (t != null) {
            try {
                c(t);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t);

    @Override // defpackage.cpc
    public final void cancel() {
    }

    @Override // defpackage.cpc
    public final cqc e() {
        return cqc.a;
    }

    public abstract T f(Uri uri, ContentResolver contentResolver);

    @Override // defpackage.cpc
    public final void d(lw20 lw20Var, cpc.a<? super T> aVar) {
        try {
            T tF = f(this.b, this.c);
            this.d = tF;
            aVar.f(tF);
        } catch (FileNotFoundException e) {
            String str = LhMGMAwwhzjwfz.iIeIkWTNEYAgrt;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to open Uri", e);
            }
            aVar.c(e);
        }
    }
}
