package yads;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class cr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rq0 f147877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mq0 f147878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ld0 f147879c;

    public cr(rq0 rq0Var) {
        this.f147877a = rq0Var;
    }

    public final void a(p30 p30Var, Uri uri, Map map, long j10, long j11, pq0 pq0Var) throws ka3 {
        ld0 ld0Var = new ld0(p30Var, j10, j11);
        this.f147879c = ld0Var;
        if (this.f147878b != null) {
            return;
        }
        mq0[] mq0VarArrCreateExtractors = this.f147877a.createExtractors(uri, map);
        if (mq0VarArrCreateExtractors.length == 1) {
            this.f147878b = mq0VarArrCreateExtractors[0];
        } else {
            for (mq0 mq0Var : mq0VarArrCreateExtractors) {
                try {
                    if (mq0Var.a(ld0Var)) {
                        this.f147878b = mq0Var;
                        ld0Var.f151949f = 0;
                        break;
                    } else if (this.f147878b == null && ld0Var.f151947d != j10) {
                        throw new IllegalStateException();
                    }
                } catch (EOFException unused) {
                    if (this.f147878b != null) {
                        continue;
                    } else if (ld0Var.f151947d != j10) {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th2) {
                    if (this.f147878b == null && ld0Var.f151947d != j10) {
                        throw new IllegalStateException();
                    }
                    ld0Var.f151949f = 0;
                    throw th2;
                }
                ld0Var.f151949f = 0;
            }
            if (this.f147878b == null) {
                StringBuilder sb2 = new StringBuilder("None of the available extractors (");
                int i10 = ib3.f150516a;
                StringBuilder sb3 = new StringBuilder();
                for (int i11 = 0; i11 < mq0VarArrCreateExtractors.length; i11++) {
                    sb3.append(mq0VarArrCreateExtractors[i11].getClass().getSimpleName());
                    if (i11 < mq0VarArrCreateExtractors.length - 1) {
                        sb3.append(", ");
                    }
                }
                sb2.append(sb3.toString());
                sb2.append(") could read the stream.");
                String string = sb2.toString();
                uri.getClass();
                throw new ka3(string);
            }
        }
        this.f147878b.a(pq0Var);
    }
}
