package com.sportybet.plugin.realsports.event.comment.prematch.data;

import com.google.protobuf.RuntimeVersion;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.RecommendCodeResponse;
import defpackage.bm50;
import defpackage.c0d;
import defpackage.k5b;
import defpackage.lk50;
import defpackage.lyh;
import defpackage.myh;
import defpackage.na20;
import defpackage.or60;
import defpackage.ozh;
import defpackage.t88;
import defpackage.tje0;
import defpackage.v1b;
import defpackage.vch0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u0012\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/sportybet/plugin/realsports/event/comment/prematch/data/PreMatchCommentRepositoryImpl;", "Lna20;", "Lt88;", "apiService", "Lk5b;", "ioDispatcher", "<init>", "(Lt88;Lk5b;)V", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "Llyh;", "Llk50;", "Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/RecommendCodeResponse;", "getRecommendCode", "(Ljava/lang/String;)Llyh;", "Lt88;", "Lk5b;", "getIoDispatcher$annotations", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PreMatchCommentRepositoryImpl implements na20 {
    public static final int $stable = 8;
    private final t88 apiService;
    private final k5b ioDispatcher;

    /* JADX INFO: renamed from: com.sportybet.plugin.realsports.event.comment.prematch.data.PreMatchCommentRepositoryImpl$getRecommendCode$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmyh;", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/RecommendCodeResponse;", "", "<anonymous>", "(Lmyh;)V"}, k = 3, mv = {2, 4, 0})
    @c0d(c = "com.sportybet.plugin.realsports.event.comment.prematch.data.PreMatchCommentRepositoryImpl$getRecommendCode$1", f = "PreMatchCommentRepositoryImpl.kt", l = {RuntimeVersion.MINOR, RuntimeVersion.MINOR}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends tje0 implements Function2<myh<? super BaseResponse<RecommendCodeResponse>>, v1b<? super Unit>, Object> {
        final /* synthetic */ String $eventId;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, v1b<? super AnonymousClass1> v1bVar) {
            super(2, v1bVar);
            this.$eventId = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            AnonymousClass1 anonymousClass1 = PreMatchCommentRepositoryImpl.this.new AnonymousClass1(this.$eventId, v1bVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<RecommendCodeResponse>> myhVar, v1b<? super Unit> v1bVar) {
            return ((AnonymousClass1) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.L$0
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r6.label
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L23
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r7)
                goto L48
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                java.lang.Object r0 = r6.L$1
                myh r0 = (defpackage.myh) r0
                defpackage.uj50.b(r7)
                goto L3b
            L23:
                defpackage.uj50.b(r7)
                com.sportybet.plugin.realsports.event.comment.prematch.data.PreMatchCommentRepositoryImpl r7 = com.sportybet.plugin.realsports.event.comment.prematch.data.PreMatchCommentRepositoryImpl.this
                t88 r7 = com.sportybet.plugin.realsports.event.comment.prematch.data.PreMatchCommentRepositoryImpl.access$getApiService$p(r7)
                java.lang.String r2 = r6.$eventId
                r6.L$0 = r5
                r6.L$1 = r0
                r6.label = r4
                java.lang.Object r7 = r7.a(r2, r6)
                if (r7 != r1) goto L3b
                goto L47
            L3b:
                r6.L$0 = r5
                r6.L$1 = r5
                r6.label = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L48
            L47:
                return r1
            L48:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportybet.plugin.realsports.event.comment.prematch.data.PreMatchCommentRepositoryImpl.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public PreMatchCommentRepositoryImpl(t88 t88Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        t88Var.getClass();
        k5bVar.getClass();
        this.apiService = t88Var;
        this.ioDispatcher = k5bVar;
    }

    @Dispatcher(sportyDispatcher = SportyDispatchers.IO)
    private static /* synthetic */ void getIoDispatcher$annotations() {
    }

    @Override // defpackage.na20
    public lyh<lk50<RecommendCodeResponse>> getRecommendCode(String eventId) {
        eventId.getClass();
        return ozh.c(bm50.b(new or60(new AnonymousClass1(eventId, null)), vch0.b), this.ioDispatcher);
    }
}
