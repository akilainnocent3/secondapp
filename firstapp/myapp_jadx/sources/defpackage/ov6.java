package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lov6;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ov6 extends j8i0 {
    public final jv6 a;
    public final fbh0 b;
    public final vu90<jox<iv6>> c;
    public final vu90 d;

    @c0d(c = "com.sportybet.plugin.realsports.home.CenterTabViewModel$updateCenterTab$1", f = "CenterTabViewModel.kt", l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, 38, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER, 40}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super iv6>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.d = str;
            this.e = str2;
            this.f = str3;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = ov6.this.new a(this.d, this.e, this.f, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super iv6> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x006d  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
        
            if (r1.emit(r13, r12) == r2) goto L25;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                ov6 r0 = defpackage.ov6.this
                jv6 r0 = r0.a
                java.lang.Object r1 = r12.b
                myh r1 = (defpackage.myh) r1
                y5b r2 = defpackage.y5b.a
                int r3 = r12.a
                r4 = 0
                java.lang.String r5 = r12.f
                java.lang.String r6 = r12.e
                java.lang.String r7 = r12.d
                r8 = 4
                r9 = 3
                r10 = 2
                r11 = 1
                if (r3 == 0) goto L37
                if (r3 == r11) goto L33
                if (r3 == r10) goto L2f
                if (r3 == r9) goto L2b
                if (r3 != r8) goto L25
                defpackage.uj50.b(r13)
                goto L7d
            L25:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r12)
                return r4
            L2b:
                defpackage.uj50.b(r13)
                goto L6d
            L2f:
                defpackage.uj50.b(r13)
                goto L5c
            L33:
                defpackage.uj50.b(r13)
                goto L4b
            L37:
                defpackage.uj50.b(r13)
                cfd[] r13 = defpackage.cfd.b
                r12.b = r1
                r12.a = r11
                zed r13 = r0.a
                java.lang.String r3 = "new_center_tab_link"
                java.lang.Object r13 = r13.putString(r3, r7, r12)
                if (r13 != r2) goto L4b
                goto L7c
            L4b:
                cfd[] r13 = defpackage.cfd.b
                r12.b = r1
                r12.a = r10
                zed r13 = r0.a
                java.lang.String r3 = "new_center_tab_image"
                java.lang.Object r13 = r13.putString(r3, r6, r12)
                if (r13 != r2) goto L5c
                goto L7c
            L5c:
                cfd[] r13 = defpackage.cfd.b
                r12.b = r1
                r12.a = r9
                zed r13 = r0.a
                java.lang.String r0 = "new_center_tab_text"
                java.lang.Object r13 = r13.putString(r0, r5, r12)
                if (r13 != r2) goto L6d
                goto L7c
            L6d:
                iv6 r13 = new iv6
                r13.<init>(r7, r6, r5)
                r12.b = r4
                r12.a = r8
                java.lang.Object r12 = r1.emit(r13, r12)
                if (r12 != r2) goto L7d
            L7c:
                return r2
            L7d:
                kotlin.Unit r12 = kotlin.Unit.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: ov6.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.home.CenterTabViewModel$updateCenterTab$2", f = "CenterTabViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<jox<? extends iv6>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = ov6.this.new b(v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jox<? extends iv6> joxVar, v1b<? super Unit> v1bVar) {
            return ((b) create(joxVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jox<iv6> joxVar = (jox) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ov6.this.c.m(joxVar);
            return Unit.a;
        }
    }

    public ov6(jv6 jv6Var, fbh0 fbh0Var) {
        fbh0Var.getClass();
        this.a = jv6Var;
        this.b = fbh0Var;
        vu90<jox<iv6>> vu90Var = new vu90<>();
        this.c = vu90Var;
        this.d = vu90Var;
        or60 or60Var = new or60(new mv6(this, null));
        pfd pfdVar = fse.a;
        kzh.d(new g1i(new lv6(ozh.c(or60Var, odd.b), this), new nv6(this, null)), o8i0.d(this));
    }

    public final void x1(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        or60 or60Var = new or60(new a(str, str2, str3, null));
        pfd pfdVar = fse.a;
        kzh.d(new g1i(new lv6(ozh.c(or60Var, odd.b), this), new b(null)), o8i0.d(this));
    }
}
