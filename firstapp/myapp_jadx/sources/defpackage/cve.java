package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import com.sportybet.feature.gift.giftreceived.presentation.dobreceived.DobGiftReceivedActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.feature.gift.giftreceived.presentation.dobreceived.DobGiftReceivedActivity$collectEffect$$inlined$collectWithLifecycle$default$1", f = "DobGiftReceivedActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class cve extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ DobGiftReceivedActivity b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ DobGiftReceivedActivity d;

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.gift.giftreceived.presentation.dobreceived.DobGiftReceivedActivity$collectEffect$$inlined$collectWithLifecycle$default$1$1", f = "DobGiftReceivedActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ DobGiftReceivedActivity d;

        /* JADX INFO: renamed from: cve$a$a, reason: collision with other inner class name */
        public static final class C0466a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ DobGiftReceivedActivity b;

            public C0466a(v5b v5bVar, DobGiftReceivedActivity dobGiftReceivedActivity) {
                this.b = dobGiftReceivedActivity;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                com.sportybet.feature.gift.giftreceived.presentation.dobreceived.a aVar = (com.sportybet.feature.gift.giftreceived.presentation.dobreceived.a) t;
                boolean z = aVar instanceof com.sportybet.feature.gift.giftreceived.presentation.dobreceived.a.C0367a;
                DobGiftReceivedActivity dobGiftReceivedActivity = this.b;
                if (z) {
                    bum bumVar = dobGiftReceivedActivity.d;
                    if (bumVar == null) {
                        Intrinsics.n("giftRouter");
                        throw null;
                    }
                    bumVar.a("", ((com.sportybet.feature.gift.giftreceived.presentation.dobreceived.a.C0367a) aVar).a);
                    dobGiftReceivedActivity.finish();
                } else if (Intrinsics.g(aVar, com.sportybet.feature.gift.giftreceived.presentation.dobreceived.a.b.a)) {
                    azm azmVar = dobGiftReceivedActivity.c;
                    if (azmVar == null) {
                        Intrinsics.n("generalRouter");
                        throw null;
                    }
                    azmVar.d(wae.GAMES_LOBBY);
                    dobGiftReceivedActivity.finish();
                } else {
                    if (!Intrinsics.g(aVar, com.sportybet.feature.gift.giftreceived.presentation.dobreceived.a.c.a)) {
                        uhc.a();
                        return null;
                    }
                    azm azmVar2 = dobGiftReceivedActivity.c;
                    if (azmVar2 == null) {
                        Intrinsics.n("generalRouter");
                        throw null;
                    }
                    azmVar2.d(wae.SPORTS_MENU);
                    dobGiftReceivedActivity.finish();
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, DobGiftReceivedActivity dobGiftReceivedActivity) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = dobGiftReceivedActivity;
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
                C0466a c0466a = new C0466a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0466a, this) == y5bVar) {
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
    public cve(DobGiftReceivedActivity dobGiftReceivedActivity, lyh lyhVar, v1b v1bVar, DobGiftReceivedActivity dobGiftReceivedActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = dobGiftReceivedActivity;
        this.c = lyhVar;
        this.d = dobGiftReceivedActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new cve(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((cve) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
                ib5.a(yFmFZvuWxAYfEj.CYQ);
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
