package defpackage;

import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpu5;", "Lj8i0;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class pu5 extends j8i0 {
    public final wwd0 a;
    public final v340 b;
    public final b390 c;
    public final t340 d;

    public static final class a implements lyh<jse> {
        public final /* synthetic */ wwd0 a;
        public final /* synthetic */ pu5 b;

        /* JADX INFO: renamed from: pu5$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.calendar.viewmodel.CalendarViewModel$special$$inlined$map$1", f = "CalendarViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0985a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0985a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ pu5 b;

            /* JADX INFO: renamed from: pu5$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.calendar.viewmodel.CalendarViewModel$special$$inlined$map$1$2", f = "CalendarViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0986a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0986a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, pu5 pu5Var) {
                this.a = myhVar;
                this.b = pu5Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0986a c0986a;
                Object bVar;
                if (v1bVar instanceof C0986a) {
                    c0986a = (C0986a) v1bVar;
                    int i = c0986a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0986a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0986a = new C0986a(v1bVar);
                    }
                } else {
                    c0986a = new C0986a(v1bVar);
                }
                Object obj2 = c0986a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0986a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    pyc pycVarA1 = this.b.A1((pyc) obj);
                    if (pycVarA1 instanceof pyc.b) {
                        jse.a.getClass();
                        bVar = jse.a.b;
                    } else {
                        if (!(pycVarA1 instanceof pyc.a)) {
                            uhc.a();
                            return null;
                        }
                        pyc.a aVar = (pyc.a) pycVarA1;
                        Date date = aVar.a;
                        bwf0 bwf0Var = bwf0.a;
                        bVar = new jse.b(bwf0Var.i(date, true), bwf0Var.i(aVar.b, true));
                    }
                    c0986a.b = 1;
                    if (this.a.emit(bVar, c0986a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public a(wwd0 wwd0Var, pu5 pu5Var) {
            this.a = wwd0Var;
            this.b = pu5Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super jse> myhVar, v1b v1bVar) throws Throwable {
            C0985a c0985a;
            if (v1bVar instanceof C0985a) {
                c0985a = (C0985a) v1bVar;
                int i = c0985a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0985a.b = i - Integer.MIN_VALUE;
                } else {
                    c0985a = new C0985a(v1bVar);
                }
            } else {
                c0985a = new C0985a(v1bVar);
            }
            Object obj = c0985a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0985a.b;
            if (i2 != 0) {
                if (i2 == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            b bVar = new b(myhVar, this.b);
            c0985a.b = 1;
            this.a.collect(bVar, c0985a);
            return y5bVar;
        }
    }

    public pu5() {
        wwd0 wwd0VarA = xwd0.a(pyc.b.a);
        this.a = wwd0VarA;
        a aVar = new a(wwd0VarA, this);
        et7 et7VarD = o8i0.d(this);
        jse.a.getClass();
        this.b = e1i.e(aVar, et7VarD, q490.a.b, jse.a.b);
        b390 b390VarB = d390.b(0, 0, null, 7);
        this.c = b390VarB;
        this.d = e1i.a(b390VarB);
    }

    public pyc A1(pyc pycVar) {
        pycVar.getClass();
        if (pycVar instanceof pyc.b) {
            return pycVar;
        }
        if (pycVar instanceof pyc.a) {
            pyc.a aVar = (pyc.a) pycVar;
            return new pyc.a(gsc.c(aVar.a), gsc.b(aVar.b));
        }
        uhc.a();
        return null;
    }

    public final void x1() {
        ej5.c(o8i0.d(this), null, null, new ou5(this, null), 3);
    }

    public final void y1(long j, long j2) {
        z1(gsc.c(new Date(j)), gsc.c(new Date(j2)));
    }

    public final void z1(Date date, Date date2) {
        date.getClass();
        date2.getClass();
        pyc.a aVar = new pyc.a(date, date2);
        wwd0 wwd0Var = this.a;
        wwd0Var.getClass();
        wwd0Var.k(null, aVar);
    }
}
