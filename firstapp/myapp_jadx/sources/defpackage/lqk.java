package defpackage;

import android.os.Bundle;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.gift.giftreceived.presentation.giftreceived.GiftReceivedActivity;
import com.sportybet.feature.gift.giftreceived.presentation.giftreceived.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.giftreceived.presentation.giftreceived.GiftReceivedActivity$collectEffect$$inlined$collectWithLifecycle$default$1", f = "GiftReceivedActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class lqk extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ GiftReceivedActivity b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ GiftReceivedActivity d;

    @c0d(c = "com.sportybet.feature.gift.giftreceived.presentation.giftreceived.GiftReceivedActivity$collectEffect$$inlined$collectWithLifecycle$default$1$1", f = "GiftReceivedActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ GiftReceivedActivity d;

        /* JADX INFO: renamed from: lqk$a$a, reason: collision with other inner class name */
        public static final class C0833a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ GiftReceivedActivity b;

            public C0833a(v5b v5bVar, GiftReceivedActivity giftReceivedActivity) {
                this.b = giftReceivedActivity;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                f fVar = (f) t;
                boolean z = fVar instanceof f.d;
                GiftReceivedActivity giftReceivedActivity = this.b;
                if (z) {
                    Bundle bundleA = x6.a("data_enable_default_action_bar", true);
                    bundleA.putString("title", giftReceivedActivity.getCMSString(R.string.gift__l_gifts, new Object[0]));
                    azm.c(giftReceivedActivity.z1(), ((f.d) fVar).a, bundleA, null, 4);
                } else if (fVar instanceof f.a) {
                    bum bumVar = giftReceivedActivity.d;
                    if (bumVar == null) {
                        Intrinsics.n("giftRouter");
                        throw null;
                    }
                    bumVar.a("", ((f.a) fVar).a);
                    giftReceivedActivity.finish();
                } else if (Intrinsics.g(fVar, f.b.a)) {
                    giftReceivedActivity.z1().d(wae.GAMES_LOBBY);
                    giftReceivedActivity.finish();
                } else {
                    if (!Intrinsics.g(fVar, f.c.a)) {
                        uhc.a();
                        return null;
                    }
                    giftReceivedActivity.z1().d(wae.SPORTS_MENU);
                    giftReceivedActivity.finish();
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, GiftReceivedActivity giftReceivedActivity) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = giftReceivedActivity;
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
                C0833a c0833a = new C0833a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0833a, this) == y5bVar) {
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
    public lqk(GiftReceivedActivity giftReceivedActivity, lyh lyhVar, v1b v1bVar, GiftReceivedActivity giftReceivedActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = giftReceivedActivity;
        this.c = lyhVar;
        this.d = giftReceivedActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new lqk(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((lqk) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
