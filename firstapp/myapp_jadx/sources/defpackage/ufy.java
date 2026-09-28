package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportybet.feature.liveoddsboost.OddsBoostRtpRatio;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.liveoddsboost.domain.OddsBoostConfigurationManagerImpl$refreshBoostRtpRatios$2", f = "OddsBoostConfigurationManagerImpl.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class ufy extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public pjd a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ wfy d;

    @c0d(c = "com.sportybet.feature.liveoddsboost.domain.OddsBoostConfigurationManagerImpl$refreshBoostRtpRatios$2$flashOddsRatios$1", f = "OddsBoostConfigurationManagerImpl.kt", l = {41}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super zi50<? extends List<? extends OddsBoostRtpRatio>>>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ wfy c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wfy wfyVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = wfyVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends List<? extends OddsBoostRtpRatio>>> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    wfy wfyVar = this.c;
                    zi50.a aVar = zi50.b;
                    fgy fgyVar = wfyVar.a;
                    this.b = null;
                    this.a = 1;
                    obj = fgyVar.e(this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                bVar = (List) obj;
                zi50.a aVar2 = zi50.b;
            } catch (Throwable th) {
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
            return new zi50(bVar);
        }
    }

    @c0d(c = "com.sportybet.feature.liveoddsboost.domain.OddsBoostConfigurationManagerImpl$refreshBoostRtpRatios$2$oddsBoostRatios$1", f = "OddsBoostConfigurationManagerImpl.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super zi50<? extends List<? extends OddsBoostRtpRatio>>>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ wfy c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wfy wfyVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = wfyVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.c, v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends List<? extends OddsBoostRtpRatio>>> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    wfy wfyVar = this.c;
                    zi50.a aVar = zi50.b;
                    fgy fgyVar = wfyVar.a;
                    this.b = null;
                    this.a = 1;
                    obj = fgyVar.a(this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                bVar = (List) obj;
                zi50.a aVar2 = zi50.b;
            } catch (Throwable th) {
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
            return new zi50(bVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufy(wfy wfyVar, v1b<? super ufy> v1bVar) {
        super(2, v1bVar);
        this.d = wfyVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ufy ufyVar = new ufy(this.d, v1bVar);
        ufyVar.c = obj;
        return ufyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ufy) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r10 == r1) goto L29;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.Object r0 = r9.c
            v5b r0 = (defpackage.v5b) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r9.b
            r3 = 2
            r4 = 1
            wfy r5 = r9.d
            r6 = 0
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L17
            defpackage.uj50.b(r10)
            goto L72
        L17:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r6
        L1d:
            pjd r0 = r9.a
            defpackage.uj50.b(r10)
            goto L53
        L23:
            defpackage.uj50.b(r10)
            ufy$b r10 = new ufy$b
            r10.<init>(r5, r6)
            r2 = 3
            pjd r10 = defpackage.ej5.a(r0, r6, r10, r2)
            boolean r7 = r5.i()
            if (r7 == 0) goto L40
            ufy$a r7 = new ufy$a
            r7.<init>(r5, r6)
            pjd r0 = defpackage.ej5.a(r0, r6, r7, r2)
            goto L41
        L40:
            r0 = r6
        L41:
            if (r0 == 0) goto L64
            r9.c = r6
            r9.a = r10
            r9.b = r4
            java.lang.Object r0 = r0.q(r9)
            if (r0 != r1) goto L50
            goto L71
        L50:
            r8 = r0
            r0 = r10
            r10 = r8
        L53:
            zi50 r10 = (defpackage.zi50) r10
            java.lang.Object r10 = r10.a
            boolean r2 = r10 instanceof zi50.b
            if (r2 == 0) goto L5c
            r10 = r6
        L5c:
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto L63
            r5.f = r10
            goto L65
        L63:
            r10 = r0
        L64:
            r0 = r10
        L65:
            r9.c = r6
            r9.a = r6
            r9.b = r3
            java.lang.Object r10 = r0.await(r9)
            if (r10 != r1) goto L72
        L71:
            return r1
        L72:
            zi50 r10 = (defpackage.zi50) r10
            java.lang.Object r9 = r10.a
            boolean r10 = r9 instanceof zi50.b
            if (r10 == 0) goto L7b
            r9 = r6
        L7b:
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L84
            r5.e = r9
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L84:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ufy.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
