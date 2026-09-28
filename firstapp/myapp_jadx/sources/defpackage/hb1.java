package defpackage;

import com.sporty.android.core.model.notification.NotificationSetting;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.autobet.AutoBetViewModel$onCheckNotificationAfterCreate$1", f = "AutoBetViewModel.kt", l = {551, 556, 564}, m = "invokeSuspend", v = 2)
public final class hb1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public boolean a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ fb1 d;
    public final /* synthetic */ boolean e;

    @c0d(c = "com.sportybet.plugin.realsports.autobet.AutoBetViewModel$onCheckNotificationAfterCreate$1$isApiAutoBetEnabled$1$result$1", f = "AutoBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<lk50<? extends List<? extends NotificationSetting>>, v1b<? super Boolean>, Object> {
        public /* synthetic */ Object a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(2, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends List<? extends NotificationSetting>> lk50Var, v1b<? super Boolean> v1bVar) {
            return ((a) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(!(lk50Var instanceof lk50.b));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb1(fb1 fb1Var, boolean z, v1b<? super hb1> v1bVar) {
        super(2, v1bVar);
        this.d = fb1Var;
        this.e = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hb1 hb1Var = new hb1(this.d, this.e, v1bVar);
        hb1Var.c = obj;
        return hb1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hb1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0077 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:11:0x0024, B:26:0x0071, B:28:0x0077, B:31:0x007d, B:33:0x0083, B:34:0x0087, B:36:0x008d, B:40:0x009e, B:42:0x00a2, B:43:0x00a6, B:23:0x0051), top: B:57:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:11:0x0024, B:26:0x0071, B:28:0x0077, B:31:0x007d, B:33:0x0083, B:34:0x0087, B:36:0x008d, B:40:0x009e, B:42:0x00a2, B:43:0x00a6, B:23:0x0051), top: B:57:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a2 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:11:0x0024, B:26:0x0071, B:28:0x0077, B:31:0x007d, B:33:0x0083, B:34:0x0087, B:36:0x008d, B:40:0x009e, B:42:0x00a2, B:43:0x00a6, B:23:0x0051), top: B:57:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d6, code lost:
    
        if (r10.emit(r2, r9) == r1) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, v5b] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hb1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
