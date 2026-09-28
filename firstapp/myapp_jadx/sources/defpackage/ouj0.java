package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ouj0 {
    public final ArrayList a;

    public static final class a extends qlr implements Function1<fwa, CharSequence> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(fwa fwaVar) {
            fwa fwaVar2 = fwaVar;
            fwaVar2.getClass();
            return fwaVar2.getClass().getSimpleName();
        }
    }

    public static final class b implements lyh<rxa> {
        public final /* synthetic */ lyh[] a;

        public static final class a extends qlr implements Function0<rxa[]> {
            public final /* synthetic */ lyh[] a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(lyh[] lyhVarArr) {
                super(0);
                this.a = lyhVarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final rxa[] invoke() {
                return new rxa[this.a.length];
            }
        }

        /* JADX INFO: renamed from: ouj0$b$b, reason: collision with other inner class name */
        @c0d(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", l = {292}, m = "invokeSuspend")
        public static final class C0950b extends tje0 implements gaj<myh<? super rxa>, rxa[], v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ myh b;
            public /* synthetic */ Object[] c;

            @Override // defpackage.gaj
            public final Object invoke(myh<? super rxa> myhVar, rxa[] rxaVarArr, v1b<? super Unit> v1bVar) {
                C0950b c0950b = new C0950b(3, v1bVar);
                c0950b.b = myhVar;
                c0950b.c = rxaVarArr;
                return c0950b.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                rxa rxaVar = null;
                if (i == 0) {
                    uj50.b(obj);
                    myh myhVar = this.b;
                    for (rxa rxaVar2 : (rxa[]) this.c) {
                        if (!Intrinsics.g(rxaVar2, rxa.a.a)) {
                            rxaVar = rxaVar2;
                            break;
                        }
                    }
                    if (rxaVar == null) {
                        rxaVar = rxa.a.a;
                    }
                    this.a = 1;
                    if (myhVar.emit(rxaVar, this) == y5bVar) {
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

        public b(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super rxa> myhVar, v1b v1bVar) {
            lyh[] lyhVarArr = this.a;
            Object objA = r78.a(v1bVar, myhVar, new C0950b(3, null), new a(lyhVarArr), lyhVarArr);
            return objA == y5b.a ? objA : Unit.a;
        }
    }

    public ouj0(vjg0 vjg0Var) {
        box boxVar;
        vjg0Var.getClass();
        xwa<Boolean> xwaVar = vjg0Var.b;
        xwaVar.getClass();
        pd2 pd2Var = new pd2(xwaVar);
        td2 td2Var = vjg0Var.c;
        td2Var.getClass();
        sd2 sd2Var = new sd2(td2Var);
        xwa<Boolean> xwaVar2 = vjg0Var.e;
        xwaVar2.getClass();
        o1e0 o1e0Var = new o1e0(xwaVar2);
        xwa<nox> xwaVar3 = vjg0Var.d;
        xwaVar3.getClass();
        imx imxVar = new imx(xwaVar3);
        uox uoxVar = new uox(xwaVar3);
        rnx rnxVar = new rnx(xwaVar3);
        cnx cnxVar = new cnx(xwaVar3);
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = vjg0Var.a;
            String str = quj0.a;
            context.getClass();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            boxVar = new box((ConnectivityManager) systemService);
        } else {
            boxVar = null;
        }
        this.a = ay0.v(new fwa[]{pd2Var, sd2Var, o1e0Var, imxVar, uoxVar, rnxVar, cnxVar, boxVar});
    }

    public final boolean a(owj0 owj0Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (((fwa) obj).a(owj0Var)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            jgt.e().a(quj0.a, "Work " + owj0Var.a + " constrained by " + CollectionsKt.a0(arrayList, null, null, null, a.a, 31));
        }
        return arrayList.isEmpty();
    }

    public final lyh<rxa> b(owj0 owj0Var) {
        owj0Var.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (((fwa) obj).c(owj0Var)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(l48.r(arrayList, 10));
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList3.add(((fwa) obj2).b(owj0Var.j));
        }
        return uzh.b(new b((lyh[]) CollectionsKt.A0(arrayList3).toArray(new lyh[0])));
    }
}
