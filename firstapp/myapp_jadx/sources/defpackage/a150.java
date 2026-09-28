package defpackage;

import android.os.Trace;
import com.bumptech.glide.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a150 implements c0l<x050> {
    public boolean a;
    public final /* synthetic */ a b;
    public final /* synthetic */ List c;
    public final /* synthetic */ ur0 d;

    public a150(a aVar, List list, ur0 ur0Var) {
        this.b = aVar;
        this.c = list;
        this.d = ur0Var;
    }

    @Override // defpackage.c0l
    public final x050 get() {
        if (this.a) {
            ib5.a("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            return null;
        }
        Trace.beginSection(sig0.d("Glide registry"));
        this.a = true;
        try {
            return b150.a(this.b, this.c, this.d);
        } finally {
            this.a = false;
            Trace.endSection();
        }
    }
}
