package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsz70;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class sz70 extends j8i0 {
    public final t1p a;
    public final idk b;
    public final ich c;
    public final wwd0 d;

    @c0d(c = "com.sportybet.plugin.realsports.searchv2.presentation.SearchTooltipViewModel$1", f = "SearchTooltipViewModel.kt", l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public wwd0 a;
        public int b;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return sz70.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            wwd0 wwd0Var;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                sz70 sz70Var = sz70.this;
                wwd0 wwd0Var2 = sz70Var.d;
                this.a = wwd0Var2;
                this.b = 1;
                obj = sz70Var.x1(this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                wwd0Var = wwd0Var2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wwd0Var = this.a;
                uj50.b(obj);
            }
            wwd0Var.setValue(obj);
            return Unit.a;
        }
    }

    public sz70(t1p t1pVar, idk idkVar, ich ichVar) {
        ichVar.getClass();
        this.a = t1pVar;
        this.b = idkVar;
        this.c = ichVar;
        this.d = xwd0.a(Boolean.FALSE);
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r7 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x1(defpackage.x1b r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.tz70
            if (r0 == 0) goto L13
            r0 = r7
            tz70 r0 = (defpackage.tz70) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tz70 r0 = new tz70
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            defpackage.uj50.b(r7)
            goto L73
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L31:
            defpackage.uj50.b(r7)
            goto L5e
        L35:
            defpackage.uj50.b(r7)
            ich r7 = r6.c
            java.lang.String r2 = "search_tooltip_displayed"
            boolean r7 = r7.a(r2)
            if (r7 == 0) goto L45
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L45:
            r0.c = r4
            t1p r7 = r6.a
            lq1 r2 = r7.a
            com.sporty.android.core.model.config.bo.enums.BOConfigParam r5 = com.sporty.android.core.model.config.bo.enums.BOConfigParam.NewSearchScreen
            yi5 r7 = r7.b
            yi5$c r7 = r7.b()
            java.lang.String r7 = r7.a()
            java.lang.Object r7 = defpackage.qq1.k(r2, r5, r7, r0)
            if (r7 != r1) goto L5e
            goto L72
        L5e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7c
            r0.c = r3
            idk r6 = r6.b
            lx70 r6 = r6.a
            java.lang.Object r7 = r6.a(r0)
            if (r7 != r1) goto L73
        L72:
            return r1
        L73:
            com.sportybet.plugin.realsports.searchv2.domain.model.SearchFeatureConfig r7 = (com.sportybet.plugin.realsports.searchv2.domain.model.SearchFeatureConfig) r7
            boolean r6 = r7.getShowTooltip()
            if (r6 == 0) goto L7c
            goto L7d
        L7c:
            r4 = 0
        L7d:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz70.x1(x1b):java.lang.Object");
    }
}
