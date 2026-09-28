package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sdd implements cbs {
    public final rdd a;
    public final cbs b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[s9s.a.values().length];
            try {
                iArr[s9s.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s9s.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s9s.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s9s.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s9s.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s9s.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[s9s.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    public sdd(rdd rddVar, cbs cbsVar) {
        this.a = rddVar;
        this.b = cbsVar;
    }

    @Override // defpackage.cbs
    public final void F0(ibs ibsVar, s9s.a aVar) {
        int i = a.a[aVar.ordinal()];
        rdd rddVar = this.a;
        switch (i) {
            case 1:
                rddVar.o1(ibsVar);
                break;
            case 2:
                rddVar.onStart(ibsVar);
                break;
            case 3:
                rddVar.onResume(ibsVar);
                break;
            case 4:
                rddVar.onPause(ibsVar);
                break;
            case 5:
                rddVar.onStop(ibsVar);
                break;
            case 6:
                rddVar.onDestroy(ibsVar);
                break;
            case 7:
                hb5.a("ON_ANY must not been send by anybody");
                return;
            default:
                uhc.a();
                return;
        }
        cbs cbsVar = this.b;
        if (cbsVar != null) {
            cbsVar.F0(ibsVar, aVar);
        }
    }
}
