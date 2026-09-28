package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.DigitsKeyListener;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.CombEditText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.pocket.common.AssetData;
import com.sporty.android.core.model.pocket.deposit.CardStatusData;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.android.widget.SimpleDescriptionListView;
import com.sportybet.feature.payment.impl.deposit.presentation.adapter.DepositCardSavedAdapter;
import com.sportybet.feature.payment.impl.deposit.presentation.widget.AmountQuickAddingButtonGroup;
import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lusd;", "Lg02;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class usd extends spl {
    public jvi f0;
    public final q8i0 g0;
    public final DepositCardSavedAdapter h0;
    public PopupWindow i0;
    public bc6 j0;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositCardFragment$initTradingViewModel$1$10", f = "DepositCardFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = usd.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, v1b<? super Unit> v1bVar) {
            return ((a) create(str, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (str == null) {
                str = "";
            }
            usd usdVar = usd.this;
            jvi jviVar = usdVar.f0;
            if (jviVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            if (!Intrinsics.g(jviVar.D.w.getText(), str)) {
                jvi jviVar2 = usdVar.f0;
                if (jviVar2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                jviVar2.D.w.setText(str);
            }
            jvi jviVar3 = usdVar.f0;
            if (jviVar3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            if (!Intrinsics.g(jviVar3.y.getText(), str)) {
                jvi jviVar4 = usdVar.f0;
                if (jviVar4 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                jviVar4.y.setText(str);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositCardFragment$initTradingViewModel$1$11", f = "DepositCardFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = usd.this.new b(v1bVar);
            bVar.a = ((Boolean) obj).booleanValue();
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((b) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            usd usdVar = usd.this;
            jvi jviVar = usdVar.f0;
            if (jviVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ImageView imageView = jviVar.D.C;
            if (z) {
                imageView.setImageResource(R.drawable.spr_checked3x);
                imageView.clearColorFilter();
            } else {
                imageView.setImageResource(R.drawable.spr_unchecked3x);
                imageView.setColorFilter(usdVar.requireContext().getColor(R.color.line_type1_secondary));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositCardFragment$initTradingViewModel$1$12", f = "DepositCardFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = usd.this.new c(v1bVar);
            cVar.a = ((Boolean) obj).booleanValue();
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((c) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            usd usdVar = usd.this;
            jvi jviVar = usdVar.f0;
            if (jviVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ImageView imageView = jviVar.D.D;
            if (z) {
                imageView.setImageResource(R.drawable.spr_checked3x);
                imageView.clearColorFilter();
            } else {
                imageView.setImageResource(R.drawable.spr_unchecked3x);
                imageView.setColorFilter(usdVar.requireContext().getColor(R.color.line_type1_secondary));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositCardFragment$initTradingViewModel$1$13", f = "DepositCardFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<c330, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = usd.this.new d(v1bVar);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c330 c330Var, v1b<? super Unit> v1bVar) {
            return ((d) create(c330Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            c330 c330Var = (c330) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            jvi jviVar = usd.this.f0;
            if (jviVar != null) {
                b330.a(jviVar.L, c330Var);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositCardFragment$initTradingViewModel$1$15", f = "DepositCardFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<List<? extends String>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = usd.this.new e(v1bVar);
            eVar.a = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends String> list, v1b<? super Unit> v1bVar) {
            return ((e) create(list, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List<String> list = (List) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            usd usdVar = usd.this;
            jvi jviVar = usdVar.f0;
            if (jviVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            jviVar.v.removeAllViews();
            for (String str : list) {
                Context context = usdVar.getContext();
                if (context != null) {
                    ImageView imageView = new ImageView(context);
                    FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(zch0.b(context.getResources(), 30), zch0.b(context.getResources(), 20));
                    layoutParams.setMargins(zch0.b(context.getResources(), 3), zch0.b(context.getResources(), 3), zch0.b(context.getResources(), 3), zch0.b(context.getResources(), 3));
                    imageView.setLayoutParams(layoutParams);
                    jvi jviVar2 = usdVar.f0;
                    if (jviVar2 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    jviVar2.v.addView(imageView);
                    gbn gbnVar = usdVar.i;
                    if (gbnVar == null) {
                        Intrinsics.n("imageService");
                        throw null;
                    }
                    gbnVar.e(str, imageView, R.drawable.icon_default, R.drawable.icon_default);
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositCardFragment$initTradingViewModel$1$16", f = "DepositCardFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<cg6, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f fVar = usd.this.new f(v1bVar);
            fVar.a = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(cg6 cg6Var, v1b<? super Unit> v1bVar) {
            return ((f) create(cg6Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            cg6 cg6Var = (cg6) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            bc6 bc6Var = cg6Var.b;
            usd usdVar = usd.this;
            usdVar.j0 = bc6Var;
            jvi jviVar = usdVar.f0;
            if (jviVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            WebView webView = jviVar.Q;
            webView.requestFocus();
            webView.loadDataWithBaseURL(null, cg6Var.a, vZBMKENANSz.fxAHJbQqj, "US-ASCII", null);
            webView.setVisibility(0);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositCardFragment$initTradingViewModel$1$17", f = "DepositCardFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements Function2<CardStatusData, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public g(v1b<? super g> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            g gVar = usd.this.new g(v1bVar);
            gVar.a = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CardStatusData cardStatusData, v1b<? super Unit> v1bVar) {
            return ((g) create(cardStatusData, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            CardStatusData cardStatusData = (CardStatusData) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean cardExisted = cardStatusData != null ? cardStatusData.getCardExisted() : false;
            usd usdVar = usd.this;
            jvi jviVar = usdVar.f0;
            if (jviVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            jviVar.F.setVisibility(!cardExisted ? 0 : 4);
            jvi jviVar2 = usdVar.f0;
            if (jviVar2 != null) {
                jviVar2.y.setVisibility(cardExisted ? 8 : 0);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositCardFragment$initTradingViewModel$1$18", f = "DepositCardFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends tje0 implements gaj<ncx, o200, v1b<? super Unit>, Object> {
        public /* synthetic */ ncx a;
        public /* synthetic */ o200 b;

        public static final class a extends ClickableSpan {
            public final /* synthetic */ usd a;

            public a(usd usdVar) {
                this.a = usdVar;
            }

            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                view.getClass();
                tud tudVarP0 = this.a.P0();
                ej5.c(o8i0.d(tudVarP0), null, null, new p02(tudVarP0, null), 3);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.getClass();
                super.updateDrawState(textPaint);
                textPaint.setColor(this.a.requireContext().getColor(R.color.text_type1_primary));
                textPaint.setUnderlineText(true);
            }
        }

        public h(v1b<? super h> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(ncx ncxVar, o200 o200Var, v1b<? super Unit> v1bVar) {
            h hVar = usd.this.new h(v1bVar);
            hVar.a = ncxVar;
            hVar.b = o200Var;
            return hVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ncx ncxVar = this.a;
            o200 o200Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = ncxVar.b;
            usd usdVar = usd.this;
            if (z) {
                usdVar.D0().setVisibility(0);
                String strD = sn5.d(usdVar, R.string.common_functions__click_here, new Object[0]);
                SpannableString spannableString = new SpannableString(tug.a(strD, " ", sn5.d(usdVar, R.string.page_payment__name_confirm_tips, new Object[0])));
                spannableString.setSpan(new a(usdVar), 0, strD.length(), 17);
                usdVar.D0().setHint(spannableString);
                usdVar.D0().getTextView().setMovementMethod(LinkMovementMethod.getInstance());
            } else if (o200Var.a != null) {
                usdVar.D0().setVisibility(0);
                HintView hintViewD0 = usdVar.D0();
                UiText uiText = o200Var.a;
                Context contextRequireContext = usdVar.requireContext();
                contextRequireContext.getClass();
                HintView.setHintInHtml$default(hintViewD0, uiText.e(contextRequireContext), 0, 2, null);
                usdVar.D0().setTypeColor(o200Var.b);
            } else {
                usdVar.D0().setVisibility(8);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositCardFragment$initTradingViewModel$1$1", f = "DepositCardFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class i extends tje0 implements Function2<UiText, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public i(v1b<? super i> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            i iVar = usd.this.new i(v1bVar);
            iVar.a = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UiText uiText, v1b<? super Unit> v1bVar) {
            return ((i) create(uiText, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            UiText uiText = (UiText) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            usd usdVar = usd.this;
            jvi jviVar = usdVar.f0;
            if (uiText != null) {
                if (jviVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                HintView hintView = jviVar.N;
                Context contextRequireContext = usdVar.requireContext();
                contextRequireContext.getClass();
                hintView.setHint(Html.fromHtml(uiText.e(contextRequireContext).toString(), 0));
                jvi jviVar2 = usdVar.f0;
                if (jviVar2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                jviVar2.N.setVisibility(0);
            } else {
                if (jviVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                jviVar.N.setVisibility(8);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositCardFragment$initTradingViewModel$1$2", f = "DepositCardFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class j extends tje0 implements gaj<List<? extends AssetData.CardsBean>, AssetData.CardsBean, v1b<? super Unit>, Object> {
        public /* synthetic */ List a;
        public /* synthetic */ AssetData.CardsBean b;
        public final /* synthetic */ tud d;

        public static final class a {
            public final /* synthetic */ tud a;
            public final /* synthetic */ usd b;

            public a(tud tudVar, usd usdVar) {
                this.a = tudVar;
                this.b = usdVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(tud tudVar, v1b<? super j> v1bVar) {
            super(3, v1bVar);
            this.d = tudVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(List<? extends AssetData.CardsBean> list, AssetData.CardsBean cardsBean, v1b<? super Unit> v1bVar) {
            j jVar = usd.this.new j(this.d, v1bVar);
            jVar.a = list;
            jVar.b = cardsBean;
            return jVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List<AssetData.CardsBean> list = this.a;
            AssetData.CardsBean cardsBean = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean zIsEmpty = list.isEmpty();
            usd usdVar = usd.this;
            jvi jviVar = usdVar.f0;
            if (zIsEmpty) {
                if (jviVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                jviVar.D.a.setVisibility(0);
                jvi jviVar2 = usdVar.f0;
                if (jviVar2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                jviVar2.C.setVisibility(8);
            } else {
                if (jviVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                jviVar.D.a.setVisibility(8);
                jvi jviVar3 = usdVar.f0;
                if (jviVar3 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                jviVar3.C.setVisibility(0);
            }
            DepositCardSavedAdapter depositCardSavedAdapter = usdVar.h0;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            for (AssetData.CardsBean cardsBean2 : list) {
                boolean z = cardsBean != null && cardsBean2.getId() == cardsBean.getId();
                a aVar = new a(this.d, usdVar);
                kg6 kg6Var = new kg6();
                kg6Var.a = cardsBean2;
                kg6Var.b = z;
                kg6Var.c = aVar;
                arrayList.add(kg6Var);
            }
            depositCardSavedAdapter.setList(new ArrayList(arrayList));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositCardFragment$initTradingViewModel$1$3", f = "DepositCardFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class k extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;

        public k(v1b<? super k> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            k kVar = usd.this.new k(v1bVar);
            kVar.a = ((Boolean) obj).booleanValue();
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((k) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            jvi jviVar = usd.this.f0;
            if (jviVar != null) {
                jviVar.K.setVisibility(z ? 0 : 8);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositCardFragment$initTradingViewModel$1$4", f = "DepositCardFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class l extends tje0 implements Function2<eg6, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public l(v1b<? super l> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            l lVar = usd.this.new l(v1bVar);
            lVar.a = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(eg6 eg6Var, v1b<? super Unit> v1bVar) {
            return ((l) create(eg6Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            View contentView;
            eg6 eg6Var = (eg6) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            usd usdVar = usd.this;
            PopupWindow popupWindow = usdVar.i0;
            View viewFindViewById = (popupWindow == null || (contentView = popupWindow.getContentView()) == null) ? null : contentView.findViewById(R.id.loading_mask);
            if (Intrinsics.g(eg6Var, eg6.c.a)) {
                PopupWindow popupWindow2 = usdVar.i0;
                if (popupWindow2 != null) {
                    popupWindow2.setTouchInterceptor(new vsd());
                }
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(0);
                }
            } else if (Intrinsics.g(eg6Var, eg6.b.a)) {
                PopupWindow popupWindow3 = usdVar.i0;
                if (popupWindow3 != null) {
                    popupWindow3.setTouchInterceptor(new wsd());
                }
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(8);
                }
            } else if (Intrinsics.g(eg6Var, eg6.a.a)) {
                PopupWindow popupWindow4 = usdVar.i0;
                if (popupWindow4 != null) {
                    popupWindow4.setTouchInterceptor(new xsd());
                }
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(8);
                }
                PopupWindow popupWindow5 = usdVar.i0;
                if (popupWindow5 != null) {
                    popupWindow5.dismiss();
                }
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositCardFragment$initTradingViewModel$1$5", f = "DepositCardFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class m extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
        public m(v1b<? super m> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return usd.this.new m(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
            return ((m) create(unit, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            new u3e().show(usd.this.getChildFragmentManager(), usd.class.getSimpleName());
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositCardFragment$initTradingViewModel$1$6", f = "DepositCardFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class n extends tje0 implements Function2<zyx, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public n(v1b<? super n> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            n nVar = usd.this.new n(v1bVar);
            nVar.a = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(zyx zyxVar, v1b<? super Unit> v1bVar) {
            return ((n) create(zyxVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            zyx zyxVar = (zyx) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            jvi jviVar = usd.this.f0;
            if (jviVar != null) {
                azx.a(zyxVar, jviVar.D.i);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositCardFragment$initTradingViewModel$1$7", f = "DepositCardFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class o extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;

        public o(v1b<? super o> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            o oVar = usd.this.new o(v1bVar);
            oVar.a = ((Boolean) obj).booleanValue();
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((o) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            usd usdVar = usd.this;
            jvi jviVar = usdVar.f0;
            if (z) {
                if (jviVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                jviVar.D.i.setError(sn5.d(usdVar, R.string.page_payment__please_enter_a_valid_card_number, new Object[0]));
            } else {
                if (jviVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                jviVar.D.i.setError(null);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositCardFragment$initTradingViewModel$1$8", f = "DepositCardFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class p extends tje0 implements Function2<yyx, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public p(v1b<? super p> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            p pVar = usd.this.new p(v1bVar);
            pVar.a = obj;
            return pVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(yyx yyxVar, v1b<? super Unit> v1bVar) {
            return ((p) create(yyxVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            yyx yyxVar = (yyx) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            jvi jviVar = usd.this.f0;
            if (jviVar != null) {
                oxo.a(yyxVar, jviVar.D.z);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositCardFragment$initTradingViewModel$1$9", f = "DepositCardFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class q extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;

        public q(v1b<? super q> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            q qVar = usd.this.new q(v1bVar);
            qVar.a = ((Boolean) obj).booleanValue();
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((q) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            usd usdVar = usd.this;
            jvi jviVar = usdVar.f0;
            if (z) {
                if (jviVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                jviVar.D.z.setError(sn5.d(usdVar, R.string.page_withdraw__invalid_expiry_date, new Object[0]));
            } else {
                if (jviVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                jviVar.D.z.setError(null);
            }
            return Unit.a;
        }
    }

    public static final class r implements lyh<List<? extends String>> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositCardFragment$initTradingViewModel$lambda$0$$inlined$map$1", f = "DepositCardFragment.kt", l = {109}, m = "collect", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return r.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositCardFragment$initTradingViewModel$lambda$0$$inlined$map$1$2", f = "DepositCardFragment.kt", l = {51, 50}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;
                public myh d;
                public List e;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
            
                if (r10.emit(r9, r0) == r1) goto L22;
             */
            @Override // defpackage.myh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r10, defpackage.v1b r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof usd.r.b.a
                    if (r0 == 0) goto L13
                    r0 = r11
                    usd$r$b$a r0 = (usd.r.b.a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    usd$r$b$a r0 = new usd$r$b$a
                    r0.<init>(r11)
                L18:
                    java.lang.Object r11 = r0.a
                    y5b r1 = defpackage.y5b.a
                    int r2 = r0.b
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L39
                    if (r2 == r4) goto L31
                    if (r2 != r3) goto L2b
                    defpackage.uj50.b(r11)
                    goto L5f
                L2b:
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r9)
                    return r5
                L31:
                    java.util.List r9 = r0.e
                    myh r10 = r0.d
                    defpackage.uj50.b(r11)
                    goto L52
                L39:
                    defpackage.uj50.b(r11)
                    java.util.List r10 = (java.util.List) r10
                    myh r9 = r9.a
                    r0.d = r9
                    r0.e = r10
                    r0.b = r4
                    r6 = 100
                    java.lang.Object r11 = defpackage.hkd.b(r6, r0)
                    if (r11 != r1) goto L4f
                    goto L5e
                L4f:
                    r8 = r10
                    r10 = r9
                    r9 = r8
                L52:
                    r0.d = r5
                    r0.e = r5
                    r0.b = r3
                    java.lang.Object r9 = r10.emit(r9, r0)
                    if (r9 != r1) goto L5f
                L5e:
                    return r1
                L5f:
                    kotlin.Unit r9 = kotlin.Unit.a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: usd.r.b.emit(java.lang.Object, v1b):java.lang.Object");
            }
        }

        public r(lyh lyhVar) {
            this.a = lyhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super List<? extends String>> myhVar, v1b v1bVar) {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final class s extends qlr implements Function0<v8i0> {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return usd.this.requireActivity().getViewModelStore();
        }
    }

    public static final class t extends qlr implements Function0<cyb> {
        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return usd.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class u extends qlr implements Function0<r8i0.c> {
        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return usd.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public usd() {
        super(0);
        this.g0 = new q8i0(jq40.a(tud.class), new s(), new u(), new t());
        this.h0 = new DepositCardSavedAdapter();
    }

    @Override // defpackage.s62
    public final HintView D0() {
        jvi jviVar = this.f0;
        if (jviVar != null) {
            return jviVar.G;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final FrameLayout E0() {
        jvi jviVar = this.f0;
        if (jviVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        FrameLayout frameLayout = jviVar.a;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // defpackage.s62
    public final SwipeRefreshLayout G0() {
        jvi jviVar = this.f0;
        if (jviVar != null) {
            return jviVar.O;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.g02, defpackage.s62
    public final void K0() {
        super.K0();
        tud tudVarP0 = P0();
        g1i g1iVar = new g1i(tudVarP0.E0, new i(null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar);
        n1i n1iVar = new n1i(tudVarP0.F0, tudVarP0.H0, new j(tudVarP0, null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        arr.a(n1iVar, lifecycle2, bVar);
        g1i g1iVar2 = new g1i(tudVarP0.j1, new k(null));
        s9s lifecycle3 = getLifecycle();
        lifecycle3.getClass();
        arr.a(g1iVar2, lifecycle3, bVar);
        g1i g1iVar3 = new g1i(tudVarP0.h1, new l(null));
        s9s lifecycle4 = getLifecycle();
        lifecycle4.getClass();
        arr.a(g1iVar3, lifecycle4, bVar);
        g1i g1iVar4 = new g1i(tudVarP0.o1, new m(null));
        s9s lifecycle5 = getLifecycle();
        lifecycle5.getClass();
        arr.a(g1iVar4, lifecycle5, bVar);
        g1i g1iVar5 = new g1i(tudVarP0.Q0, new n(null));
        s9s lifecycle6 = getLifecycle();
        lifecycle6.getClass();
        arr.a(g1iVar5, lifecycle6, bVar);
        g1i g1iVar6 = new g1i(tudVarP0.S0, new o(null));
        s9s lifecycle7 = getLifecycle();
        lifecycle7.getClass();
        arr.a(g1iVar6, lifecycle7, bVar);
        g1i g1iVar7 = new g1i(tudVarP0.V0, new p(null));
        s9s lifecycle8 = getLifecycle();
        lifecycle8.getClass();
        arr.a(g1iVar7, lifecycle8, bVar);
        g1i g1iVar8 = new g1i(tudVarP0.X0, new q(null));
        s9s lifecycle9 = getLifecycle();
        lifecycle9.getClass();
        arr.a(g1iVar8, lifecycle9, bVar);
        g1i g1iVar9 = new g1i(tudVarP0.Z0, new a(null));
        s9s lifecycle10 = getLifecycle();
        lifecycle10.getClass();
        arr.a(g1iVar9, lifecycle10, bVar);
        g1i g1iVar10 = new g1i(tudVarP0.c1, new b(null));
        s9s lifecycle11 = getLifecycle();
        lifecycle11.getClass();
        arr.a(g1iVar10, lifecycle11, bVar);
        g1i g1iVar11 = new g1i(tudVarP0.d1, new c(null));
        s9s lifecycle12 = getLifecycle();
        lifecycle12.getClass();
        arr.a(g1iVar11, lifecycle12, bVar);
        g1i g1iVar12 = new g1i(tudVarP0.L0, new d(null));
        s9s lifecycle13 = getLifecycle();
        lifecycle13.getClass();
        arr.a(g1iVar12, lifecycle13, bVar);
        g1i g1iVar13 = new g1i(new r(tudVarP0.e1), new e(null));
        s9s lifecycle14 = getLifecycle();
        lifecycle14.getClass();
        arr.a(g1iVar13, lifecycle14, bVar);
        g1i g1iVar14 = new g1i(tudVarP0.m1, new f(null));
        s9s lifecycle15 = getLifecycle();
        lifecycle15.getClass();
        arr.a(g1iVar14, lifecycle15, bVar);
        g1i g1iVar15 = new g1i(tudVarP0.I0, new g(null));
        s9s lifecycle16 = getLifecycle();
        lifecycle16.getClass();
        arr.a(g1iVar15, lifecycle16, bVar);
        n1i n1iVar2 = new n1i(tudVarP0.Y, tudVarP0.D0, new h(null));
        s9s lifecycle17 = getLifecycle();
        lifecycle17.getClass();
        arr.a(n1iVar2, lifecycle17, bVar);
    }

    @Override // defpackage.g02, defpackage.s62
    public final void L0() {
        super.L0();
        jvi jviVar = this.f0;
        if (jviVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        r910.b(jviVar.I);
        jvi jviVar2 = this.f0;
        if (jviVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        RecyclerView recyclerView = jviVar2.M;
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        jvi jviVar3 = this.f0;
        if (jviVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        jviVar3.M.setAdapter(this.h0);
        jvi jviVar4 = this.f0;
        if (jviVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        jviVar4.K.setOnClickedClose(new z00(this, 1));
        jvi jviVar5 = this.f0;
        if (jviVar5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        cr0.c(jviVar5.D);
        jvi jviVar6 = this.f0;
        if (jviVar6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        zrr zrrVar = jviVar6.D;
        CombEditText combEditText = zrrVar.i;
        CombEditText combEditText2 = zrrVar.z;
        combEditText.setTextChangedListener(new osd(this));
        combEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: psd
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.a.P0().Q1(z);
            }
        });
        combEditText2.setTextChangedListener(new CombEditText.d() { // from class: qsd
            @Override // com.sporty.android.common_ui.widgets.CombEditText.d
            public final void l(CharSequence charSequence) {
                this.a.P0().N1(StringsKt.t0(charSequence.toString()).toString());
            }
        });
        combEditText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: rsd
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.a.P0().O1(z);
            }
        });
        zrrVar.w.setTextChangedListener(new CombEditText.d() { // from class: ssd
            @Override // com.sporty.android.common_ui.widgets.CombEditText.d
            public final void l(CharSequence charSequence) {
                this.a.P0().R1(StringsKt.t0(charSequence.toString()).toString());
            }
        });
        int i2 = 0;
        zrrVar.C.setOnClickListener(new tsd(this, i2));
        zrrVar.D.setOnClickListener(new View.OnClickListener() { // from class: gsd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wwd0 wwd0Var = this.a.P0().b1;
                wwd0Var.k(null, Boolean.valueOf(!((Boolean) wwd0Var.getValue()).booleanValue()));
            }
        });
        zrrVar.B.setOnClickListener(new View.OnClickListener() { // from class: hsd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.P0().U1();
            }
        });
        jvi jviVar7 = this.f0;
        if (jviVar7 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView = jviVar7.P;
        j7g j7gVar = new j7g();
        j7gVar.b("＋  ");
        j7gVar.a(sn5.d(this, R.string.page_payment__use_new_card, new Object[0]));
        textView.setText(j7gVar);
        jvi jviVar8 = this.f0;
        if (jviVar8 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        jviVar8.P.setOnClickListener(new View.OnClickListener() { // from class: isd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                view.getClass();
                lop.b(view, Boolean.FALSE);
                tud tudVarP0 = this.a.P0();
                ej5.c(o8i0.d(tudVarP0), null, null, new jtd(tudVarP0, null), 3);
            }
        });
        jvi jviVar9 = this.f0;
        if (jviVar9 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        jviVar9.F.setOnClickListener(new lsd(this, i2));
        jvi jviVar10 = this.f0;
        if (jviVar10 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        CombEditText combEditText3 = jviVar10.y;
        combEditText3.setCanCopy(Boolean.FALSE);
        combEditText3.setLabelImage(R.drawable.ic_lock_unify);
        combEditText3.setLabelText(sn5.c(combEditText3, R.string.page_payment__cvv, new Object[0]));
        combEditText3.setEditHint(sn5.c(combEditText3, R.string.page_payment__vnum_digits, "3"));
        jvi jviVar11 = this.f0;
        if (jviVar11 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        combEditText3.setErrorView(jviVar11.z);
        combEditText3.setError(null);
        combEditText3.setKeyListener(DigitsKeyListener.getInstance("0123456789"));
        combEditText3.setMaxLength(3);
        combEditText3.setInputType(18);
        combEditText3.setTextChangedListener(new CombEditText.d() { // from class: msd
            @Override // com.sporty.android.common_ui.widgets.CombEditText.d
            public final void l(CharSequence charSequence) {
                this.a.P0().R1(StringsKt.t0(charSequence.toString()).toString());
            }
        });
        jvi jviVar12 = this.f0;
        if (jviVar12 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        jviVar12.b.setErrorView(jviVar12.d);
        jvi jviVar13 = this.f0;
        if (jviVar13 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        jviVar13.L.setOnClickListener(new View.OnClickListener() { // from class: nsd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                view.getClass();
                lop.b(view, Boolean.FALSE);
                tud tudVarP0 = this.a.P0();
                ej5.c(o8i0.d(tudVarP0), null, null, new itd(tudVarP0, null), 3);
            }
        });
        jvi jviVar14 = this.f0;
        if (jviVar14 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        WebView webView = jviVar14.Q;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.setWebViewClient(new ysd(webView, this));
    }

    @Override // defpackage.g02
    public final AmountQuickAddingButtonGroup M0() {
        jvi jviVar = this.f0;
        if (jviVar != null) {
            return jviVar.A;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.g02
    public final ComposeView N0() {
        jvi jviVar = this.f0;
        if (jviVar != null) {
            return jviVar.w;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.g02
    public final ComposeView O0() {
        jvi jviVar = this.f0;
        if (jviVar != null) {
            return jviVar.B;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.g02
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public final tud P0() {
        return (tud) this.g0.getValue();
    }

    @Override // defpackage.s62
    public final List<ClearEditText> m0() {
        jvi jviVar = this.f0;
        if (jviVar != null) {
            return kotlin.collections.b.k(jviVar.b, jviVar.D.c);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final List<TextView> n0() {
        jvi jviVar = this.f0;
        if (jviVar != null) {
            return kotlin.collections.b.k(jviVar.c, jviVar.D.b);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final FrameLayout o0() {
        jvi jviVar = this.f0;
        if (jviVar != null) {
            return jviVar.e;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_deposit_card, viewGroup, false);
        int i2 = R.id.ad_text_view;
        if (((TextView) h5e.a(R.id.ad_text_view, viewInflate)) != null) {
            i2 = R.id.amount;
            ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.amount, viewInflate);
            if (clearEditText != null) {
                i2 = R.id.amount_container;
                if (((FrameLayout) h5e.a(R.id.amount_container, viewInflate)) != null) {
                    i2 = R.id.amount_label;
                    TextView textView = (TextView) h5e.a(R.id.amount_label, viewInflate);
                    if (textView != null) {
                        i2 = R.id.amount_warning;
                        TextView textView2 = (TextView) h5e.a(R.id.amount_warning, viewInflate);
                        if (textView2 != null) {
                            i2 = R.id.anti_interaction_mask;
                            FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.anti_interaction_mask, viewInflate);
                            if (frameLayout != null) {
                                i2 = R.id.balance;
                                TextView textView3 = (TextView) h5e.a(R.id.balance, viewInflate);
                                if (textView3 != null) {
                                    i2 = R.id.balance_label;
                                    TextView textView4 = (TextView) h5e.a(R.id.balance_label, viewInflate);
                                    if (textView4 != null) {
                                        i2 = R.id.card_image_container;
                                        FlexboxLayout flexboxLayout = (FlexboxLayout) h5e.a(R.id.card_image_container, viewInflate);
                                        if (flexboxLayout != null) {
                                            i2 = R.id.compose_custom_container;
                                            ComposeView composeView = (ComposeView) h5e.a(R.id.compose_custom_container, viewInflate);
                                            if (composeView != null) {
                                                i2 = R.id.cvv_edit_text;
                                                CombEditText combEditText = (CombEditText) h5e.a(R.id.cvv_edit_text, viewInflate);
                                                if (combEditText != null) {
                                                    i2 = R.id.cvv_warning;
                                                    TextView textView5 = (TextView) h5e.a(R.id.cvv_warning, viewInflate);
                                                    if (textView5 != null) {
                                                        i2 = R.id.deposit_amount_quick_adding_buttons;
                                                        AmountQuickAddingButtonGroup amountQuickAddingButtonGroup = (AmountQuickAddingButtonGroup) h5e.a(R.id.deposit_amount_quick_adding_buttons, viewInflate);
                                                        if (amountQuickAddingButtonGroup != null) {
                                                            i2 = R.id.deposit_banner_compose_view;
                                                            ComposeView composeView2 = (ComposeView) h5e.a(R.id.deposit_banner_compose_view, viewInflate);
                                                            if (composeView2 != null) {
                                                                i2 = R.id.deposit_with_exist_group;
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.deposit_with_exist_group, viewInflate);
                                                                if (constraintLayout != null) {
                                                                    i2 = R.id.deposit_with_new_card_layout;
                                                                    View viewA = h5e.a(R.id.deposit_with_new_card_layout, viewInflate);
                                                                    if (viewA != null) {
                                                                        zrr zrrVarA = zrr.a(viewA);
                                                                        i2 = R.id.description_list_view;
                                                                        SimpleDescriptionListView simpleDescriptionListView = (SimpleDescriptionListView) h5e.a(R.id.description_list_view, viewInflate);
                                                                        if (simpleDescriptionListView != null) {
                                                                            i2 = R.id.guideline_begin;
                                                                            if (((Guideline) h5e.a(R.id.guideline_begin, viewInflate)) != null) {
                                                                                i2 = R.id.guideline_end;
                                                                                if (((Guideline) h5e.a(R.id.guideline_end, viewInflate)) != null) {
                                                                                    i2 = R.id.help_cvv_icon;
                                                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.help_cvv_icon, viewInflate);
                                                                                    if (appCompatImageView != null) {
                                                                                        i2 = R.id.hint_view;
                                                                                        HintView hintView = (HintView) h5e.a(R.id.hint_view, viewInflate);
                                                                                        if (hintView != null) {
                                                                                            i2 = R.id.init_failed_mask;
                                                                                            LoadingViewNew loadingViewNew = (LoadingViewNew) h5e.a(R.id.init_failed_mask, viewInflate);
                                                                                            if (loadingViewNew != null) {
                                                                                                i2 = R.id.init_mask;
                                                                                                ComposeView composeView3 = (ComposeView) h5e.a(R.id.init_mask, viewInflate);
                                                                                                if (composeView3 != null) {
                                                                                                    i2 = R.id.loading_mask;
                                                                                                    LoadingViewNew loadingViewNew2 = (LoadingViewNew) h5e.a(R.id.loading_mask, viewInflate);
                                                                                                    if (loadingViewNew2 != null) {
                                                                                                        i2 = R.id.newFeatureAlertView;
                                                                                                        BubbleView bubbleView = (BubbleView) h5e.a(R.id.newFeatureAlertView, viewInflate);
                                                                                                        if (bubbleView != null) {
                                                                                                            i2 = R.id.next;
                                                                                                            ProgressButton progressButton = (ProgressButton) h5e.a(R.id.next, viewInflate);
                                                                                                            if (progressButton != null) {
                                                                                                                i2 = R.id.saved_card_recycler_view;
                                                                                                                RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.saved_card_recycler_view, viewInflate);
                                                                                                                if (recyclerView != null) {
                                                                                                                    i2 = R.id.secondary_hint_view;
                                                                                                                    HintView hintView2 = (HintView) h5e.a(R.id.secondary_hint_view, viewInflate);
                                                                                                                    if (hintView2 != null) {
                                                                                                                        i2 = R.id.swipe;
                                                                                                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe, viewInflate);
                                                                                                                        if (swipeRefreshLayout != null) {
                                                                                                                            i2 = R.id.use_new_card_btn;
                                                                                                                            TextView textView6 = (TextView) h5e.a(R.id.use_new_card_btn, viewInflate);
                                                                                                                            if (textView6 != null) {
                                                                                                                                i2 = R.id.verify_view;
                                                                                                                                WebView webView = (WebView) h5e.a(R.id.verify_view, viewInflate);
                                                                                                                                if (webView != null) {
                                                                                                                                    FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                                                                                                                                    this.f0 = new jvi(frameLayout2, clearEditText, textView, textView2, frameLayout, textView3, textView4, flexboxLayout, composeView, combEditText, textView5, amountQuickAddingButtonGroup, composeView2, constraintLayout, zrrVarA, simpleDescriptionListView, appCompatImageView, hintView, loadingViewNew, composeView3, loadingViewNew2, bubbleView, progressButton, recyclerView, hintView2, swipeRefreshLayout, textView6, webView);
                                                                                                                                    frameLayout2.getClass();
                                                                                                                                    return frameLayout2;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.s62
    public final List<TextView> p0() {
        jvi jviVar = this.f0;
        if (jviVar != null) {
            return kotlin.collections.b.k(jviVar.i, jviVar.D.e);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final List<TextView> q0() {
        jvi jviVar = this.f0;
        if (jviVar != null) {
            return kotlin.collections.b.k(jviVar.f, jviVar.D.f);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final SimpleDescriptionListView t0() {
        jvi jviVar = this.f0;
        if (jviVar != null) {
            return jviVar.E;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew u0() {
        jvi jviVar = this.f0;
        if (jviVar != null) {
            return jviVar.H;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final ComposeView v0() {
        jvi jviVar = this.f0;
        if (jviVar != null) {
            return jviVar.I;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew w0() {
        jvi jviVar = this.f0;
        if (jviVar != null) {
            return jviVar.J;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
