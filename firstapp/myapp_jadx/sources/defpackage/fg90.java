package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.homeshortcut.sidepanel.ui.SidePanelLazyListStateKt$rememberSidePanelLazyListState$1$1", f = "SidePanelLazyListState.kt", l = {58}, m = "invokeSuspend", v = 2)
public final class fg90 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ osw c;
    public final /* synthetic */ Function1<Integer, Unit> d;
    public final /* synthetic */ ytw<yp70> e;

    @c0d(c = "com.sporty.android.platform.features.homeshortcut.sidepanel.ui.SidePanelLazyListStateKt$rememberSidePanelLazyListState$1$1$2", f = "SidePanelLazyListState.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<mp70, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ zzr b;
        public final /* synthetic */ osw c;
        public final /* synthetic */ Function1<Integer, Unit> d;
        public final /* synthetic */ ytw<yp70> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zzr zzrVar, osw oswVar, Function1 function1, ytw ytwVar, v1b v1bVar) {
            super(2, v1bVar);
            this.b = zzrVar;
            this.c = oswVar;
            this.d = function1;
            this.e = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, this.c, this.d, this.e, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(mp70 mp70Var, v1b<? super Unit> v1bVar) {
            return ((a) create(mp70Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            mp70 mp70Var = (mp70) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = mp70Var.a;
            List<zyr> list = mp70Var.b;
            int i = mp70Var.c;
            int i2 = mp70Var.d;
            ytw<yp70> ytwVar = this.e;
            if (z) {
                if (ytwVar.getValue() == yp70.a) {
                    return Unit.a;
                }
                ytwVar.setValue(yp70.c);
            } else if (ytwVar.getValue() != yp70.c) {
                return Unit.a;
            }
            Integer numA = ig90.a(this.b, this.c);
            if (numA == null) {
                return Unit.a;
            }
            int iIntValue = numA.intValue();
            int iA = -i2;
            Iterator<zyr> it = list.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (it.next().getIndex() == i) {
                    break;
                }
                i3++;
            }
            Integer numValueOf = Integer.valueOf(i3);
            Integer numValueOf2 = null;
            if (i3 < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                for (zyr zyrVar : CollectionsKt.O(list, numValueOf.intValue())) {
                    iA += zyrVar.a();
                    if (iA >= iIntValue) {
                        numValueOf2 = Integer.valueOf(zyrVar.getIndex());
                        break;
                    }
                }
            }
            if (numValueOf2 == null) {
                return Unit.a;
            }
            this.d.invoke(new Integer(numValueOf2.intValue()));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg90(zzr zzrVar, osw oswVar, Function1 function1, ytw ytwVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = zzrVar;
        this.c = oswVar;
        this.d = function1;
        this.e = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fg90(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((fg90) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            or60 or60VarC = n95.c(new ryr(this.b, 1));
            a aVar = new a(this.b, this.c, this.d, this.e, null);
            this.a = 1;
            Object objCollect = or60VarC.collect(new g1i.a(gyx.a, aVar), this);
            if (objCollect != y5bVar) {
                objCollect = Unit.a;
            }
            if (objCollect != y5bVar) {
                objCollect = Unit.a;
            }
            if (objCollect == y5bVar) {
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
