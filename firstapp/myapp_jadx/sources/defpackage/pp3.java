package defpackage;

import android.text.TextUtils;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.MyLog;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.presentation.fragment.BetslipFragment$initViewModel$$inlined$collectWithLifecycle$2", f = "BetslipFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class pp3 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ibs b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ jp3 d;

    @c0d(c = "com.sportybet.android.virtual.presentation.fragment.BetslipFragment$initViewModel$$inlined$collectWithLifecycle$2$1", f = "BetslipFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ jp3 d;

        /* JADX INFO: renamed from: pp3$a$a, reason: collision with other inner class name */
        public static final class C0980a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ jp3 b;

            public C0980a(v5b v5bVar, jp3 jp3Var) {
                this.b = jp3Var;
                this.a = v5bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                jp3.a aVar = jp3.c0;
                jp3 jp3Var = this.b;
                o4p o4pVar = jp3Var.z;
                if (o4pVar != null) {
                    ArrayList arrayList = o4pVar.d;
                    if (!TextUtils.equals(o4pVar.a, "system") && ((!TextUtils.equals(o4pVar.a, SimulateBetConsts.BetslipType.SINGLE) && !TextUtils.equals(o4pVar.a, SimulateBetConsts.BetslipType.MULTIPLE)) || arrayList.isEmpty() || arrayList.size() <= 1)) {
                        m780 m780VarT0 = jp3Var.t0();
                        if (m780VarT0 == null) {
                            o4p o4pVar2 = jp3Var.z;
                            if (o4pVar2 != null) {
                                jp3Var.T(0, o4pVar2.j.toPlainString(), false);
                            }
                        } else if (m780VarT0.b.getKind() == 3) {
                            String str = m780VarT0.a;
                            try {
                                String strP = c.p(str, ",", "", false);
                                if (strP.length() == 0) {
                                    strP = "0";
                                }
                                BigDecimal bigDecimal = new BigDecimal(strP);
                                o4p o4pVar3 = jp3Var.z;
                                if (o4pVar3 != null && o4pVar3.j.compareTo(bigDecimal) <= 0) {
                                    jp3Var.T(0, strP, false);
                                }
                            } catch (NumberFormatException e) {
                                itf0.a aVar2 = itf0.a;
                                aVar2.q(MyLog.TAG_INSTANT_WIN);
                                aVar2.p(e, "unable to parse gift value: %s", str);
                            }
                        }
                    }
                }
                jp3Var.N0();
                jp3Var.O0();
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, jp3 jp3Var) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = jp3Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar, this.d);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C0980a c0980a = new C0980a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0980a, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp3(ibs ibsVar, lyh lyhVar, v1b v1bVar, jp3 jp3Var) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = ibsVar;
        this.c = lyhVar;
        this.d = jp3Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new pp3(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pp3) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s lifecycle = this.b.getLifecycle();
            s9s.b bVar = s9s.b.d;
            a aVar = new a(this.c, null, this.d);
            this.a = 1;
            if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
