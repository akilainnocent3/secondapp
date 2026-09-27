package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class cj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rg1 f147746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f147747b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f147748c;

    public cj1(rg1 rg1Var) {
        this.f147746a = rg1Var;
    }

    public final String a() {
        String str;
        synchronized (this.f147747b) {
            try {
                if (this.f147748c == null) {
                    this.f147748c = ((tg1) this.f147746a).c("YmadMauid");
                }
                str = this.f147748c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public final void a(String str) {
        synchronized (this.f147747b) {
            this.f147748c = str;
            ((tg1) this.f147746a).a("YmadMauid", str);
            dr.w2 w2Var = dr.w2.f79517a;
        }
    }
}
