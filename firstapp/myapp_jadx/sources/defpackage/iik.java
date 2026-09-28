package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.platform.features.luckywheel.LuckyWheelActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.gift.gift.presentation.GiftActivity;
import com.sportybet.feature.gift.gift.presentation.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.presentation.GiftActivity$collectEffect$$inlined$collectWithLifecycle$default$1", f = "GiftActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class iik extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ GiftActivity b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ GiftActivity d;

    @c0d(c = "com.sportybet.feature.gift.gift.presentation.GiftActivity$collectEffect$$inlined$collectWithLifecycle$default$1$1", f = "GiftActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ GiftActivity d;

        /* JADX INFO: renamed from: iik$a$a, reason: collision with other inner class name */
        public static final class C0681a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ GiftActivity b;

            public C0681a(v5b v5bVar, GiftActivity giftActivity) {
                this.b = giftActivity;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                e eVar = (e) t;
                boolean z = eVar instanceof e.j;
                GiftActivity giftActivity = this.b;
                if (z) {
                    Bundle bundleA = x6.a("data_enable_default_action_bar", true);
                    bundleA.putString("title", giftActivity.getCMSString(R.string.gift__how_to_use, new Object[0]));
                    azm.c(giftActivity.z1(), ((e.j) eVar).a, bundleA, null, 4);
                } else if (eVar instanceof e.c) {
                    e.c cVar = (e.c) eVar;
                    List<c04> list = cVar.a;
                    ArrayList arrayList = new ArrayList(l48.r(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        bki0.a(((c04) it.next()).getId(), arrayList);
                    }
                    bum bumVar = giftActivity.d;
                    if (bumVar == null) {
                        Intrinsics.n("giftRouter");
                        throw null;
                    }
                    bumVar.a(cVar.b, arrayList);
                    Unit unit = Unit.a;
                } else if (eVar instanceof e.g) {
                    int i = LuckyWheelActivity.e;
                    Integer num = new Integer(((e.g) eVar).a.getType());
                    Intent intent = new Intent(giftActivity, (Class<?>) LuckyWheelActivity.class);
                    intent.putExtra("KEY_LW_TYPE", num);
                    giftActivity.startActivity(intent);
                    Unit unit2 = Unit.a;
                } else if (eVar instanceof e.i) {
                    azm.c(giftActivity.z1(), ((e.i) eVar).a, null, null, 6);
                } else if (Intrinsics.g(eVar, e.d.a)) {
                    giftActivity.z1().d(wae.DEPOSIT);
                } else if (Intrinsics.g(eVar, e.f.a)) {
                    giftActivity.z1().d(wae.LOYALTY);
                } else if (Intrinsics.g(eVar, e.b.a)) {
                    giftActivity.z1().k(wae.LOYALTY, new Pair[]{new Pair("tab", "benefit"), new Pair("scrollToBetslip", "true")}, null);
                } else if (Intrinsics.g(eVar, e.C0364e.a)) {
                    giftActivity.z1().d(wae.GAMES_LOBBY);
                } else if (Intrinsics.g(eVar, e.h.a)) {
                    giftActivity.z1().d(wae.SPORTS_MENU);
                } else {
                    if (!Intrinsics.g(eVar, e.a.a)) {
                        uhc.a();
                        return null;
                    }
                    giftActivity.finish();
                    Unit unit3 = Unit.a;
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, GiftActivity giftActivity) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = giftActivity;
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
                C0681a c0681a = new C0681a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0681a, this) == y5bVar) {
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
    public iik(GiftActivity giftActivity, lyh lyhVar, v1b v1bVar, GiftActivity giftActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = giftActivity;
        this.c = lyhVar;
        this.d = giftActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new iik(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((iik) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
