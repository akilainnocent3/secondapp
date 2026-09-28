package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportybet.feature.gift.gift.presentation.GiftActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.presentation.GiftActivity$collectTabChangesForFullStory$$inlined$collectWithLifecycle$default$1", f = "GiftActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class jik extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ GiftActivity b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ GiftActivity d;

    @c0d(c = "com.sportybet.feature.gift.gift.presentation.GiftActivity$collectTabChangesForFullStory$$inlined$collectWithLifecycle$default$1$1", f = "GiftActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ GiftActivity d;

        /* JADX INFO: renamed from: jik$a$a, reason: collision with other inner class name */
        public static final class C0724a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ GiftActivity b;

            public C0724a(v5b v5bVar, GiftActivity giftActivity) {
                this.b = giftActivity;
                this.a = v5bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                String str;
                GiftActivity giftActivity = this.b;
                s9s.b bVarB = giftActivity.getLifecycle().b();
                s9s.b bVar = s9s.b.e;
                bVarB.compareTo(bVar);
                int i = GiftActivity.e;
                int iOrdinal = ((uvk) t).ordinal();
                if (iOrdinal == 0) {
                    str = "GiftDetailActivity-VALID";
                } else {
                    if (iOrdinal != 1) {
                        uhc.a();
                        return null;
                    }
                    str = "GiftDetailActivity-USED_OR_EXPIRED";
                }
                giftActivity.getFullStoryCommonManager().b(str);
                giftActivity.getLifecycle().b().compareTo(bVar);
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
                C0724a c0724a = new C0724a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0724a, this) == y5bVar) {
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
    public jik(GiftActivity giftActivity, lyh lyhVar, v1b v1bVar, GiftActivity giftActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = giftActivity;
        this.c = lyhVar;
        this.d = giftActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new jik(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jik) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
