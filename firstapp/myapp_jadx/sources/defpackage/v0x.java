package defpackage;

import android.app.Dialog;
import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.a;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.social.domain.SocialRouter$PersonalSocial;
import com.sportybet.android.social.domain.entity.MySocialCreationSource;
import com.sportybet.android.social.presentation.SocialActivity;
import com.sportybet.android.social.presentation.creation.MySocialCreationActivity;
import com.sportybet.android.widget.ProgressButton;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.creation.MySocialCreationFragment$initView$1", f = "MySocialCreationFragment.kt", l = {131}, m = "invokeSuspend", v = 2)
public final class v0x extends tje0 implements Function2<pwi, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ com.sportybet.android.social.presentation.creation.a c;

    public static final class a<T> implements myh {
        public final /* synthetic */ pwi a;
        public final /* synthetic */ com.sportybet.android.social.presentation.creation.a b;

        public a(pwi pwiVar, com.sportybet.android.social.presentation.creation.a aVar) {
            this.a = pwiVar;
            this.b = aVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            final k8a0 k8a0Var = (k8a0) obj;
            boolean z = k8a0Var instanceof k8a0.e;
            final com.sportybet.android.social.presentation.creation.a aVar = this.b;
            final pwi pwiVar = this.a;
            if (z) {
                k8a0.e eVar = (k8a0.e) k8a0Var;
                boolean z2 = eVar.d;
                boolean z3 = eVar.c;
                String str = eVar.a;
                ClearEditText clearEditText = pwiVar.d;
                ProgressButton progressButton = pwiVar.b;
                if (!Intrinsics.g(str, String.valueOf(clearEditText.getText()))) {
                    pwiVar.d.setText(str);
                }
                pwiVar.f.setEnabled(z3);
                pwiVar.w.setEnabled(z3);
                pwiVar.e.setEnabled(z2);
                pwiVar.v.setEnabled(z2);
                List<String> list = eVar.e;
                String str2 = eVar.f;
                com.sportybet.android.social.presentation.creation.a.C0351a c0351a = com.sportybet.android.social.presentation.creation.a.D;
                aVar.o0(str2, false, list);
                progressButton.setLoading(false);
                progressButton.setEnabled(eVar.b);
            } else if (k8a0Var instanceof k8a0.b) {
                e activity = aVar.getActivity();
                Function1 function1 = new Function1() { // from class: t0x
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        e eVar2 = (e) obj2;
                        eVar2.getClass();
                        u1k.a aVar2 = u1k.b;
                        FragmentManager supportFragmentManager = eVar2.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        k8a0 k8a0Var2 = k8a0Var;
                        final String str3 = ((k8a0.b) k8a0Var2).a;
                        final u0x u0xVar = new u0x(pwiVar, k8a0Var2, aVar);
                        f8a0 f8a0Var = new f8a0(new op8(2024512966, new gaj() { // from class: k0x
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                final Dialog dialog = (Dialog) obj3;
                                a aVar3 = (a) obj4;
                                ((Integer) obj5).getClass();
                                dialog.getClass();
                                final u0x u0xVar2 = u0xVar;
                                boolean zM = aVar3.M(u0xVar2) | aVar3.A(dialog);
                                Object objY = aVar3.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zM || objY == c0042a) {
                                    objY = new Function0() { // from class: l0x
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            u0xVar2.invoke();
                                            dialog.dismiss();
                                            return Unit.a;
                                        }
                                    };
                                    aVar3.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                boolean zA = aVar3.A(dialog);
                                Object objY2 = aVar3.y();
                                if (zA || objY2 == c0042a) {
                                    objY2 = new epi(dialog, 3);
                                    aVar3.r(objY2);
                                }
                                n0x.a(0, aVar3, str3, function0, (Function0) objY2);
                                return Unit.a;
                            }
                        }, true));
                        aVar2.getClass();
                        u1k.a.a(supportFragmentManager, f8a0Var);
                        return Unit.a;
                    }
                };
                if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                    function1.invoke(activity);
                }
            } else {
                e eVar2 = null;
                if (k8a0Var instanceof k8a0.a) {
                    pwiVar.b.setLoading(false);
                    MySocialCreationSource mySocialCreationSource = aVar.y;
                    if (Intrinsics.g(mySocialCreationSource, MySocialCreationSource.SocialCreation.a)) {
                        SocialRouter$PersonalSocial socialRouter$PersonalSocial = SocialRouter$PersonalSocial.a;
                        k8a0.a aVar2 = (k8a0.a) k8a0Var;
                        String str3 = aVar2.a;
                        CountryCodeName countryCodeName = aVar2.b;
                        Boolean bool = aVar2.c;
                        SocialRouter$PersonalSocial.Data data = new SocialRouter$PersonalSocial.Data(str3, true, null, null, false, false, countryCodeName, countryCodeName, countryCodeName, null, 0, 0, false, null, bool != null ? bool.booleanValue() : false, null, 48700, null);
                        socialRouter$PersonalSocial.getClass();
                        xnu xnuVarA = ej0.a(SocialRouter$PersonalSocial.a(data));
                        yfx yfxVar = aVar.v;
                        if (yfxVar != null) {
                            yfxVar.k();
                            wix.a(yfxVar, socialRouter$PersonalSocial, xnuVarA);
                        }
                    } else if (Intrinsics.g(mySocialCreationSource, MySocialCreationSource.CustomCodeCreation.a)) {
                        try {
                            zi50.a aVar3 = zi50.b;
                            e activity2 = aVar.getActivity();
                            if (activity2 != null && !activity2.isFinishing() && !activity2.isDestroyed()) {
                                int i = SocialActivity.b;
                                activity2.startActivity(SocialActivity.a.a(activity2, ((k8a0.a) k8a0Var).a, false, null, false, false, null));
                                if (activity2 instanceof MySocialCreationActivity) {
                                    eVar2 = activity2;
                                }
                                MySocialCreationActivity mySocialCreationActivity = (MySocialCreationActivity) eVar2;
                                if (mySocialCreationActivity != null) {
                                    wc.a(mySocialCreationActivity);
                                } else {
                                    activity2.getSupportFragmentManager().Y();
                                }
                                Unit unit = Unit.a;
                            }
                            Unit unit2 = Unit.a;
                        } catch (Throwable unused) {
                            zi50.a aVar4 = zi50.b;
                        }
                    } else {
                        if (!Intrinsics.g(mySocialCreationSource, MySocialCreationSource.Challenge.a)) {
                            uhc.a();
                            return null;
                        }
                        e activity3 = aVar.getActivity();
                        if (activity3 != null && !activity3.isFinishing() && !activity3.isDestroyed()) {
                            MySocialCreationActivity mySocialCreationActivity2 = (MySocialCreationActivity) (activity3 instanceof MySocialCreationActivity ? activity3 : null);
                            if (mySocialCreationActivity2 != null) {
                                wc.a(mySocialCreationActivity2);
                            } else {
                                activity3.getSupportFragmentManager().Y();
                            }
                            Unit unit3 = Unit.a;
                        }
                    }
                } else if (k8a0Var instanceof k8a0.c) {
                    pwiVar.b.setLoading(false);
                    k8a0.c cVar = (k8a0.c) k8a0Var;
                    UiText uiText = cVar.a;
                    if (uiText != null) {
                        AppCompatTextView appCompatTextView = pwiVar.B;
                        Context contextRequireContext = aVar.requireContext();
                        contextRequireContext.getClass();
                        appCompatTextView.setText(uiText.e(contextRequireContext));
                        aVar.o0(null, true, cVar.c);
                        pwiVar.b.setEnabled(cVar.b);
                    } else {
                        e activity4 = aVar.getActivity();
                        if (activity4 != null && !activity4.isFinishing() && !activity4.isDestroyed()) {
                            u1k.a aVar5 = u1k.b;
                            FragmentManager supportFragmentManager = activity4.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            f8a0 f8a0Var = new f8a0(kf9.a);
                            aVar5.getClass();
                            u1k.a.a(supportFragmentManager, f8a0Var);
                            Unit unit4 = Unit.a;
                        }
                    }
                } else {
                    pwiVar.b.setLoading(true);
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0x(com.sportybet.android.social.presentation.creation.a aVar, v1b<? super v0x> v1bVar) {
        super(2, v1bVar);
        this.c = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        v0x v0xVar = new v0x(this.c, v1bVar);
        v0xVar.b = obj;
        return v0xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(pwi pwiVar, v1b<? super Unit> v1bVar) {
        ((v0x) create(pwiVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to v0x for r8v2 'this'  v1b
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v0x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
