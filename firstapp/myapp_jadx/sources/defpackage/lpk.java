package defpackage;

import com.sporty.android.core.model.gift.GiftDetails;
import com.sportybet.android.instantwin.domain.GiftCurrentBalance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lpk implements jpk {
    public final zqk a;
    public final j1b b;
    public final wwd0 c = xwd0.a(Long.valueOf(System.currentTimeMillis()));
    public jvd0 d;
    public boolean e;
    public final wwd0 f;
    public final v340 i;
    public final wwd0 v;

    public static final class a implements lyh<m780> {
        public final /* synthetic */ wwd0 a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: lpk$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.instantwin.manager.gift.GiftManagerImpl$getSelectedGiftInfoFlow$$inlined$map$1", f = "GiftManagerImpl.kt", l = {109}, m = "collect", v = 2)
        public static final class C0829a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0829a(v1b v1bVar) {
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
            public final /* synthetic */ String b;

            /* JADX INFO: renamed from: lpk$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.instantwin.manager.gift.GiftManagerImpl$getSelectedGiftInfoFlow$$inlined$map$1$2", f = "GiftManagerImpl.kt", l = {50}, m = "emit", v = 2)
            public static final class C0830a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0830a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, String str) {
                this.a = myhVar;
                this.b = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0830a c0830a;
                if (v1bVar instanceof C0830a) {
                    c0830a = (C0830a) v1bVar;
                    int i = c0830a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0830a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0830a = new C0830a(v1bVar);
                    }
                } else {
                    c0830a = new C0830a(v1bVar);
                }
                Object obj2 = c0830a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0830a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object obj3 = ((Map) obj).get(this.b);
                    c0830a.b = 1;
                    if (this.a.emit(obj3, c0830a) == y5bVar) {
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

        public a(wwd0 wwd0Var, String str) {
            this.a = wwd0Var;
            this.b = str;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super m780> myhVar, v1b v1bVar) throws Throwable {
            C0829a c0829a;
            if (v1bVar instanceof C0829a) {
                c0829a = (C0829a) v1bVar;
                int i = c0829a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0829a.b = i - Integer.MIN_VALUE;
                } else {
                    c0829a = new C0829a(v1bVar);
                }
            } else {
                c0829a = new C0829a(v1bVar);
            }
            Object obj = c0829a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0829a.b;
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
            c0829a.b = 1;
            this.a.collect(bVar, c0829a);
            return y5bVar;
        }
    }

    public lpk(zqk zqkVar, j1b j1bVar) {
        this.a = zqkVar;
        this.b = j1bVar;
        wwd0 wwd0VarA = xwd0.a(lk50.b.a);
        this.f = wwd0VarA;
        this.i = e1i.e(new ppk(new opk(wwd0VarA)), j1bVar, new mwd0(0L, Long.MAX_VALUE), m2g.a);
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.v = xwd0.a(o2gVar);
    }

    @Override // defpackage.jpk
    public final void E(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        wwd0 wwd0Var = this.v;
        LinkedHashMap linkedHashMapM = kpu.m((Map) wwd0Var.getValue());
        linkedHashMapM.remove(str);
        wwd0Var.k(null, linkedHashMapM);
    }

    @Override // defpackage.jpk
    public final lyh<m780> G0(String str) {
        return (str == null || str.length() == 0) ? new gzh(null) : uzh.b(new a(this.v, str));
    }

    @Override // defpackage.jpk
    public final void H0() {
        wwd0 wwd0Var;
        Object value;
        o2g o2gVar;
        wwd0 wwd0Var2;
        Object value2;
        wwd0 wwd0Var3;
        Object value3;
        do {
            wwd0Var = this.v;
            value = wwd0Var.getValue();
            o2gVar = o2g.a;
            o2gVar.getClass();
        } while (!wwd0Var.g(value, o2gVar));
        do {
            wwd0Var2 = this.f;
            value2 = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value2, new lk50.c(m2g.a)));
        do {
            wwd0Var3 = this.c;
            value3 = wwd0Var3.getValue();
            ((Number) value3).longValue();
        } while (!wwd0Var3.g(value3, Long.valueOf(System.currentTimeMillis())));
    }

    @Override // defpackage.jpk
    public final void I(String str, String str2, String str3) {
        Object next;
        if (str == null || str.length() == 0 || str3 == null || str3.length() == 0 || !ogx.a("\\d+(\\.\\d+)?", str3)) {
            return;
        }
        Iterator it = ((Iterable) this.i.a.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.g(((GiftDetails) next).getGiftId(), str2));
        GiftDetails giftDetails = (GiftDetails) next;
        if (giftDetails != null) {
            m780 m780Var = new m780(giftDetails, str3);
            wwd0 wwd0Var = this.v;
            LinkedHashMap linkedHashMapM = kpu.m((Map) wwd0Var.getValue());
            linkedHashMapM.put(str, m780Var);
            wwd0Var.k(null, linkedHashMapM);
        }
    }

    @Override // defpackage.jpk
    public final void R0(boolean z) {
        this.e = z;
    }

    @Override // defpackage.jpk
    public final void T0(String str) {
        str.getClass();
        boolean z = this.e;
        wwd0 wwd0Var = this.f;
        if (!z) {
            wwd0Var.k(null, new lk50.c(m2g.a));
            return;
        }
        Integer numA = vcj.a(str);
        if (numA == null) {
            wwd0Var.k(null, new lk50.c(m2g.a));
            return;
        }
        jvd0 jvd0Var = this.d;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.d = ej5.c(this.b, null, null, new kpk(null, this, numA), 3);
    }

    @Override // defpackage.jpk
    public final boolean a0() {
        return this.e;
    }

    @Override // defpackage.jpk
    public final void b0() {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.v.k(null, o2gVar);
    }

    @Override // defpackage.jpk
    public final void j1(ArrayList arrayList) {
        Iterable<GiftDetails> iterable = (Iterable) this.i.a.getValue();
        ArrayList arrayList2 = new ArrayList(l48.r(iterable, 10));
        for (GiftDetails giftDetails : iterable) {
            arrayList2.add(new GiftCurrentBalance(giftDetails.getGiftId(), giftDetails.getCurrentBalance()));
        }
        if (Intrinsics.g(CollectionsKt.r0(arrayList2, new mpk()), CollectionsKt.r0(arrayList, new npk()))) {
            return;
        }
        H0();
    }

    @Override // defpackage.jpk
    public final uwd0<List<GiftDetails>> p1() {
        return this.i;
    }

    @Override // defpackage.jpk
    public final m780 t0(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return (m780) ((Map) this.v.getValue()).get(str);
    }

    @Override // defpackage.jpk
    public final void t1() {
        wwd0 wwd0Var;
        Object value;
        this.e = false;
        do {
            wwd0Var = this.f;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, lk50.b.a));
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.v.k(null, o2gVar);
    }
}
