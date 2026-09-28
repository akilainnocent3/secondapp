package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fo20 extends m1k<fo20, a> implements znv {
    private static final fo20 DEFAULT_INSTANCE;
    private static volatile rsz<fo20> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private kou<String, ho20> preferences_ = kou.b;

    public static final class a extends m1k.a<fo20, a> implements znv {
        public a() {
            super(fo20.DEFAULT_INSTANCE);
        }
    }

    public static final class b {
        public static final fou<String, ho20> a = new fou<>(kgj0.c, kgj0.e, ho20.p());
    }

    static {
        fo20 fo20Var = new fo20();
        DEFAULT_INSTANCE = fo20Var;
        m1k.l(fo20.class, fo20Var);
    }

    public static a p() {
        return (a) ((m1k.a) DEFAULT_INSTANCE.e(m1k.f.e));
    }

    public static fo20 q(FileInputStream fileInputStream) {
        fo20 fo20Var = DEFAULT_INSTANCE;
        k08.b bVar = new k08.b(fileInputStream);
        q3h q3hVarA = q3h.a();
        fo20 fo20VarK = fo20Var.k();
        try {
            w630 w630Var = w630.c;
            w630Var.getClass();
            bn70 bn70VarA = w630Var.a(fo20VarK.getClass());
            p08 p08Var = bVar.d;
            if (p08Var == null) {
                p08Var = new p08(bVar);
            }
            bn70VarA.c(fo20VarK, p08Var, q3hVarA);
            bn70VarA.makeImmutable(fo20VarK);
            if (m1k.h(fo20VarK, true)) {
                return fo20VarK;
            }
            throw new e0p(new wdh0().getMessage());
        } catch (e0p e) {
            if (e.a) {
                throw new e0p(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof e0p) {
                throw ((e0p) e2.getCause());
            }
            throw new e0p(e2.getMessage(), e2);
        } catch (wdh0 e3) {
            throw new e0p(e3.getMessage());
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof e0p) {
                throw ((e0p) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // defpackage.m1k
    public final Object e(m1k.f fVar) {
        rsz bVar;
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new t040(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.a});
            case 3:
                return new fo20();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                rsz<fo20> rszVar = PARSER;
                if (rszVar != null) {
                    return rszVar;
                }
                synchronized (fo20.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new m1k.b();
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            default:
                bl0.a();
                return null;
        }
    }

    public final Map<String, ho20> n() {
        return Collections.unmodifiableMap(this.preferences_);
    }

    public final kou<String, ho20> o() {
        kou<String, ho20> kouVar = this.preferences_;
        if (kouVar.a) {
            return kouVar;
        }
        kou<String, ho20> kouVarD = kouVar.d();
        this.preferences_ = kouVarD;
        return kouVarD;
    }
}
