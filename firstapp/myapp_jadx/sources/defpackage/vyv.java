package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.core.model.pocket.globalpay.ChannelData;
import com.sportybet.android.globalpay.mobileMoney.b;
import com.sportybet.android.globalpay.mobileMoney.c;
import com.sportybet.android.globalpay.mobileMoney.g;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.mobileMoney.MobileMoneyDepositViewModel$1", f = "MobileMoneyDepositViewModel.kt", l = {139, 140}, m = "invokeSuspend", v = 2)
public final class vyv extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public pjd a;
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ c e;

    @c0d(c = "com.sportybet.android.globalpay.mobileMoney.MobileMoneyDepositViewModel$1$phoneDeferred$1", f = "MobileMoneyDepositViewModel.kt", l = {138}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = cVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                Object objE1 = this.b.E1(this);
                return objE1 == y5bVar ? y5bVar : objE1;
            }
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyv(c cVar, v1b<? super vyv> v1bVar) {
        super(2, v1bVar);
        this.e = cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vyv vyvVar = new vyv(this.e, v1bVar);
        vyvVar.d = obj;
        return vyvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vyv) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0078 A[SYNTHETIC] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        pjd pjdVarA;
        Object objA;
        Object obj2;
        wwd0 wwd0Var;
        Throwable thA;
        g gVar;
        ArrayList arrayList;
        Iterator it;
        int id;
        mox moxVar;
        v5b v5bVar = (v5b) this.d;
        y5b y5bVar = y5b.a;
        int i = this.c;
        c cVar = this.e;
        if (i == 0) {
            uj50.b(obj);
            pjdVarA = ej5.a(v5bVar, null, new a(cVar, null), 3);
            m4k m4kVar = cVar.c;
            f600 f600Var = f600.DEPOSIT;
            this.d = null;
            this.a = pjdVarA;
            this.c = 1;
            objA = m4kVar.a(f600Var, this);
            if (objA != y5bVar) {
            }
            return y5bVar;
        }
        if (i == 1) {
            pjdVarA = this.a;
            uj50.b(obj);
            objA = ((zi50) obj).a;
        } else {
            if (i != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.b;
            uj50.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            return Unit.a;
        }
        wwd0Var = cVar.C;
        zi50.a aVar = zi50.b;
        if (!(obj2 instanceof zi50.b)) {
            arrayList = new ArrayList();
            it = ((List) obj2).iterator();
            while (it.hasNext()) {
                id = ((ChannelData) it.next()).getId();
                c100 c100Var = c100.e;
                if (id != 35001 || id == 36001) {
                    moxVar = new mox(R.drawable.logo_intouch_mobile_money, id, new ResourceUiText(R.string.common_payment_providers__mtn_mobile_money));
                } else {
                    moxVar = (id == 35002 || id == 36002) ? new mox(R.drawable.logo_intouch_orange_money, id, new ResourceUiText(R.string.common_payment_providers__orange_mobile)) : null;
                }
                if (moxVar != null) {
                    arrayList.add(moxVar);
                }
            }
            wwd0 wwd0Var2 = cVar.L;
            wwd0Var2.getClass();
            wwd0Var2.k(null, arrayList);
            cVar.x1();
            wwd0Var.setValue(g.c.a);
            cVar.A1(new b.a(cVar.D1()));
        }
        thA = zi50.a(obj2);
        if (thA != null) {
            if (thA instanceof du7) {
                gVar = g.a.a;
            } else {
                gVar = g.b.a;
            }
            wwd0Var.setValue(gVar);
        }
        return Unit.a;
        this.d = null;
        this.a = null;
        this.b = objA;
        this.c = 2;
        Object objAwait = pjdVarA.await(this);
        if (objAwait != y5bVar) {
            Object obj3 = objA;
            obj = objAwait;
            obj2 = obj3;
            if (!((Boolean) obj).booleanValue()) {
                return Unit.a;
            }
            wwd0Var = cVar.C;
            zi50.a aVar2 = zi50.b;
            if (!(obj2 instanceof zi50.b)) {
                arrayList = new ArrayList();
                it = ((List) obj2).iterator();
                while (it.hasNext()) {
                    id = ((ChannelData) it.next()).getId();
                    c100 c100Var2 = c100.e;
                    if (id != 35001) {
                        moxVar = new mox(R.drawable.logo_intouch_mobile_money, id, new ResourceUiText(R.string.common_payment_providers__mtn_mobile_money));
                    } else {
                        moxVar = new mox(R.drawable.logo_intouch_mobile_money, id, new ResourceUiText(R.string.common_payment_providers__mtn_mobile_money));
                    }
                    if (moxVar != null) {
                        arrayList.add(moxVar);
                    }
                }
                wwd0 wwd0Var3 = cVar.L;
                wwd0Var3.getClass();
                wwd0Var3.k(null, arrayList);
                cVar.x1();
                wwd0Var.setValue(g.c.a);
                cVar.A1(new b.a(cVar.D1()));
            }
            thA = zi50.a(obj2);
            if (thA != null) {
                if (thA instanceof du7) {
                    gVar = g.a.a;
                } else {
                    gVar = g.b.a;
                }
                wwd0Var.setValue(gVar);
            }
            return Unit.a;
        }
        return y5bVar;
    }
}
