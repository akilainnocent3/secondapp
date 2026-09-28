package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import com.sporty.android.core.model.cms.CMSResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.cms.CMSRepositoryImpl$getCMSValues$1", f = "CMSRepositoryImpl.kt", l = {22, RuntimeVersion.MINOR, 29, 30, DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, 32}, m = "invokeSuspend", v = 2)
public final class yo5 extends tje0 implements Function2<myh<? super List<? extends CMSResponse>>, v1b<? super Unit>, Object> {
    public List a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ap5 d;
    public final /* synthetic */ ArrayList e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo5(ap5 ap5Var, ArrayList arrayList, v1b v1bVar) {
        super(2, v1bVar);
        this.d = ap5Var;
        this.e = arrayList;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yo5 yo5Var = new yo5(this.d, this.e, v1bVar);
        yo5Var.c = obj;
        return yo5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends CMSResponse>> myhVar, v1b<? super Unit> v1bVar) {
        return ((yo5) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085 A[PHI: r8
      0x0085: PHI (r8v14 java.lang.Object) = (r8v13 java.lang.Object), (r8v0 java.lang.Object) binds: [B:29:0x0082, B:9:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4 A[PHI: r0
      0x00a4: PHI (r0v7 java.util.List) = (r0v5 java.util.List), (r0v8 java.util.List) binds: [B:36:0x00a1, B:7:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00af, code lost:
    
        if (r2.emit(r0, r7) == r3) goto L40;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            ap5 r0 = r7.d
            in5 r1 = r0.b
            java.lang.Object r2 = r7.c
            myh r2 = (defpackage.myh) r2
            y5b r3 = defpackage.y5b.a
            int r4 = r7.b
            java.util.ArrayList r5 = r7.e
            r6 = 0
            switch(r4) {
                case 0: goto L43;
                case 1: goto L3b;
                case 2: goto L37;
                case 3: goto L33;
                case 4: goto L28;
                case 5: goto L1d;
                case 6: goto L18;
                default: goto L12;
            }
        L12:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r6
        L18:
            defpackage.uj50.b(r8)
            goto Lb2
        L1d:
            java.util.List r0 = r7.a
            defpackage.uj50.b(r8)
            zi50 r8 = (defpackage.zi50) r8
            java.lang.Object r8 = r8.a
            goto La4
        L28:
            java.util.List r0 = r7.a
            defpackage.uj50.b(r8)
            zi50 r8 = (defpackage.zi50) r8
            java.lang.Object r8 = r8.a
            goto L96
        L33:
            defpackage.uj50.b(r8)
            goto L85
        L37:
            defpackage.uj50.b(r8)
            goto L75
        L3b:
            defpackage.uj50.b(r8)
            zi50 r8 = (defpackage.zi50) r8
            java.lang.Object r8 = r8.a
            goto L52
        L43:
            defpackage.uj50.b(r8)
            r7.c = r2
            r8 = 1
            r7.b = r8
            java.io.Serializable r8 = r1.d(r5, r7)
            if (r8 != r3) goto L52
            goto Lb1
        L52:
            zi50$a r4 = defpackage.zi50.b
            boolean r4 = r8 instanceof zi50.b
            if (r4 == 0) goto L59
            r8 = r6
        L59:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L75
            boolean r4 = r8.isEmpty()
            if (r4 != 0) goto L64
            goto L65
        L64:
            r8 = r6
        L65:
            if (r8 == 0) goto L75
            r7.c = r2
            r7.a = r6
            r4 = 2
            r7.b = r4
            java.lang.Object r8 = r2.emit(r8, r7)
            if (r8 != r3) goto L75
            goto Lb1
        L75:
            rm5 r8 = r0.a
            r7.c = r2
            r7.a = r6
            r0 = 3
            r7.b = r0
            java.lang.Object r8 = r8.a(r5, r7)
            if (r8 != r3) goto L85
            goto Lb1
        L85:
            java.util.List r8 = (java.util.List) r8
            r7.c = r2
            r7.a = r8
            r0 = 4
            r7.b = r0
            java.lang.Object r0 = r1.b(r5, r7)
            if (r0 != r3) goto L95
            goto Lb1
        L95:
            r0 = r8
        L96:
            r7.c = r2
            r7.a = r0
            r8 = 5
            r7.b = r8
            java.lang.Object r8 = r1.g(r0, r7)
            if (r8 != r3) goto La4
            goto Lb1
        La4:
            r7.c = r6
            r7.a = r6
            r8 = 6
            r7.b = r8
            java.lang.Object r7 = r2.emit(r0, r7)
            if (r7 != r3) goto Lb2
        Lb1:
            return r3
        Lb2:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yo5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
