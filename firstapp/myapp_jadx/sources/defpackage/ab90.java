package defpackage;

import android.content.res.Configuration;
import com.google.protobuf.DescriptorProtos;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.share.presentation.viewmodel.ShowOffImageRefreshViewModel$refreshShowOffImages$1", f = "ShowOffImageRefreshViewModel.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER, 24}, m = "invokeSuspend", v = 2)
public final class ab90 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ bb90 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Configuration d;

    public static final class a<T> implements myh {
        public final /* synthetic */ bb90 a;

        public a(bb90 bb90Var) {
            this.a = bb90Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            return this.a.b.a.emit((Pair) obj, v1bVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab90(bb90 bb90Var, String str, Configuration configuration, v1b<? super ab90> v1bVar) {
        super(2, v1bVar);
        this.b = bb90Var;
        this.c = str;
        this.d = configuration;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ab90(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ab90) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (((defpackage.lyh) r6).collect(r1, r5) == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r5.a
            bb90 r2 = r5.b
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r3) goto L12
            defpackage.uj50.b(r6)
            goto L3f
        L12:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L19:
            defpackage.uj50.b(r6)
            goto L2f
        L1d:
            defpackage.uj50.b(r6)
            eb90 r6 = r2.a
            r5.a = r4
            java.lang.String r1 = r5.c
            android.content.res.Configuration r4 = r5.d
            java.lang.Object r6 = r6.a(r1, r4, r5)
            if (r6 != r0) goto L2f
            goto L3e
        L2f:
            lyh r6 = (defpackage.lyh) r6
            ab90$a r1 = new ab90$a
            r1.<init>(r2)
            r5.a = r3
            java.lang.Object r5 = r6.collect(r1, r5)
            if (r5 != r0) goto L3f
        L3e:
            return r0
        L3f:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab90.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
