package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class st7 extends lol {
    public m2l c;
    public odd d;

    @c0d(c = "com.sporty.android.common.cloudflare.CloudflareResultBroadcastReceiver$onReceive$1", f = "CloudflareResultBroadcastReceiver.kt", l = {33, DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public Unit a;
        public int b;
        public final /* synthetic */ String c;
        public final /* synthetic */ st7 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, st7 st7Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = str;
            this.d = st7Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0049  */
        /* JADX WARN: Code duplicated, block: B:28:0x005f  */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        
            if (r1.a.putString("cloudflare_result_token", r8, r7) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
        
            if (r1.a.putString("cloudflare_loading_state", "Success", r7) == r0) goto L25;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r7.b
                java.lang.String r2 = "dataStore"
                st7 r3 = r7.d
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L23
                if (r1 == r5) goto L1b
                if (r1 != r4) goto L15
                defpackage.uj50.b(r8)
                goto L5c
            L15:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r6
            L1b:
                kotlin.Unit r1 = r7.a
                java.lang.String r1 = (java.lang.String) r1
                defpackage.uj50.b(r8)
                goto L3d
            L23:
                defpackage.uj50.b(r8)
                java.lang.String r8 = r7.c
                if (r8 == 0) goto L44
                m2l r1 = r3.c
                if (r1 == 0) goto L40
                r7.a = r6
                r7.b = r5
                zed r1 = r1.a
                java.lang.String r5 = "cloudflare_result_token"
                java.lang.Object r8 = r1.putString(r5, r8, r7)
                if (r8 != r0) goto L3d
                goto L5b
            L3d:
                kotlin.Unit r8 = kotlin.Unit.a
                goto L45
            L40:
                kotlin.jvm.internal.Intrinsics.n(r2)
                throw r6
            L44:
                r8 = r6
            L45:
                m2l r1 = r3.c
                if (r1 == 0) goto L5f
                qt7 r2 = defpackage.qt7.a
                r7.a = r8
                r7.b = r4
                zed r8 = r1.a
                java.lang.String r1 = "cloudflare_loading_state"
                java.lang.String r2 = "Success"
                java.lang.Object r7 = r8.putString(r1, r2, r7)
                if (r7 != r0) goto L5c
            L5b:
                return r0
            L5c:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            L5f:
                kotlin.jvm.internal.Intrinsics.n(r2)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: st7.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // defpackage.lol, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if (Intrinsics.g(intent != null ? intent.getStringExtra("eventName") : null, "preloadCloudflare")) {
            String stringExtra = intent.getStringExtra("data");
            odd oddVar = this.d;
            if (oddVar != null) {
                ej5.c(w5b.a(oddVar), null, null, new a(stringExtra, this, null), 3);
            } else {
                Intrinsics.n("dispatcher");
                throw null;
            }
        }
    }
}
