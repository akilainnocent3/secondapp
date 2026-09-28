package defpackage;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.globalpay.GlobalDepositActivity;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.GlobalDepositActivity$initViewModel$$inlined$collectWithLifecycle$default$4", f = "GlobalDepositActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class s0l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ GlobalDepositActivity b;
    public final /* synthetic */ f1i c;
    public final /* synthetic */ GlobalDepositActivity d;

    @c0d(c = "com.sportybet.android.globalpay.GlobalDepositActivity$initViewModel$$inlined$collectWithLifecycle$default$4$1", f = "GlobalDepositActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ f1i c;
        public final /* synthetic */ GlobalDepositActivity d;

        /* JADX INFO: renamed from: s0l$a$a, reason: collision with other inner class name */
        public static final class C1071a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ GlobalDepositActivity b;

            public C1071a(v5b v5bVar, GlobalDepositActivity globalDepositActivity) {
                this.b = globalDepositActivity;
                this.a = v5bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                String str = (String) t;
                int i = GlobalDepositActivity.w;
                GlobalDepositActivity globalDepositActivity = this.b;
                CharSequence cMSString = globalDepositActivity.getCMSString(R.string.world_cup_mission__wc_pass_deposit_reminder, str);
                int iT = StringsKt.T(cMSString, str, 0, false, 6);
                if (iT >= 0) {
                    SpannableString spannableString = new SpannableString(cMSString);
                    spannableString.setSpan(new StyleSpan(1), iT, str.length() + iT, 33);
                    cMSString = spannableString;
                }
                zc zcVar = globalDepositActivity.d;
                if (zcVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                zcVar.z.setText(cMSString);
                zc zcVar2 = globalDepositActivity.d;
                if (zcVar2 != null) {
                    zcVar2.y.setVisibility(0);
                    return Unit.a;
                }
                Intrinsics.n("binding");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f1i f1iVar, v1b v1bVar, GlobalDepositActivity globalDepositActivity) {
            super(2, v1bVar);
            this.c = f1iVar;
            this.d = globalDepositActivity;
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
                C1071a c1071a = new C1071a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c1071a, this) == y5bVar) {
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
    public s0l(GlobalDepositActivity globalDepositActivity, f1i f1iVar, v1b v1bVar, GlobalDepositActivity globalDepositActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = globalDepositActivity;
        this.c = f1iVar;
        this.d = globalDepositActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new s0l(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((s0l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
