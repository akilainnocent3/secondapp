package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.data.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class cqa0 implements dpc, dpc.a {
    public final s4d<?> a;
    public final u4d b;
    public volatile int c;
    public volatile noc d;
    public volatile Object e;
    public volatile i2w.a<?> f;
    public volatile ooc i;

    public cqa0(s4d s4dVar, u4d u4dVar) {
        this.a = s4dVar;
        this.b = u4dVar;
    }

    @Override // dpc.a
    public final void a(nlp nlpVar, Exception exc, cpc<?> cpcVar, cqc cqcVar) {
        this.b.a(nlpVar, exc, cpcVar, this.f.c.e());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    @Override // defpackage.dpc
    public final boolean b() {
        boolean z;
        if (this.e == null) {
            if (this.d != null) {
            }
            this.d = null;
            this.f = null;
            z = false;
            while (!z) {
                ArrayList arrayListB = this.a.b();
                int i = this.c;
                this.c = i + 1;
                this.f = (i2w.a) arrayListB.get(i);
                if (this.f == null) {
                }
            }
            return z;
        }
        Object obj = this.e;
        this.e = null;
        try {
            if (d(obj)) {
                if (this.d != null || !this.d.b()) {
                    this.d = null;
                    this.f = null;
                    z = false;
                    while (!z && this.c < this.a.b().size()) {
                        ArrayList arrayListB2 = this.a.b();
                        int i2 = this.c;
                        this.c = i2 + 1;
                        this.f = (i2w.a) arrayListB2.get(i2);
                        if (this.f == null && (this.a.p.c(this.f.c.e()) || this.a.c(this.f.c.a()) != null)) {
                            this.f.c.d(this.a.o, new bqa0(this, this.f));
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
            }
        }
        return true;
    }

    @Override // dpc.a
    public final void c(nlp nlpVar, Object obj, cpc<?> cpcVar, cqc cqcVar, nlp nlpVar2) {
        this.b.c(nlpVar, obj, cpcVar, this.f.c.e(), nlpVar);
    }

    @Override // defpackage.dpc
    public final void cancel() {
        i2w.a<?> aVar = this.f;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    public final boolean d(Object obj) throws Throwable {
        Throwable th;
        int i = agt.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            a aVarG = this.a.c.a().g(obj);
            Object objA = aVarG.a();
            g4g<X> g4gVarD = this.a.d(objA);
            poc pocVar = new poc(g4gVarD, objA, this.a.i);
            nlp nlpVar = this.f.a;
            s4d<?> s4dVar = this.a;
            ooc oocVar = new ooc(nlpVar, s4dVar.n);
            fre freVarA = ((n6g.c) s4dVar.h).a();
            freVarA.a(oocVar, pocVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + oocVar + ", data: " + obj + ", encoder: " + g4gVarD + ", duration: " + agt.a(jElapsedRealtimeNanos));
            }
            if (freVarA.b(oocVar) != null) {
                this.i = oocVar;
                this.d = new noc(Collections.singletonList(this.f.a), this.a, this);
                this.f.c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.i + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.b.c(this.f.a, aVarG.a(), this.f.c, this.f.c.e(), this.f.a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.f.c.b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
