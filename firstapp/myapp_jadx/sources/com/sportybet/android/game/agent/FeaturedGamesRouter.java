package com.sportybet.android.game.agent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.featuredGames.view.FeaturedGames;
import defpackage.bmy;
import defpackage.fq5;
import defpackage.h5e;
import defpackage.haj;
import defpackage.lfy;
import defpackage.meh;
import defpackage.paj;
import defpackage.ssw;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/sportybet/android/game/agent/FeaturedGamesRouter;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/sporty/android/core/model/service/CountryCodeName;", "countryCodeName", "", "languageCode", "", "isForYouEnabled", "", "setFeaturedGames", "(Lcom/sporty/android/core/model/service/CountryCodeName;Ljava/lang/String;Z)V", "setGameObserver", "()V", "Lssw;", "b", "Lssw;", "getOpenGame", "()Lssw;", "openGame", "Lmeh;", "c", "Lmeh;", "getBinding", "()Lmeh;", "setBinding", "(Lmeh;)V", "binding", "sportygame"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FeaturedGamesRouter extends LinearLayout {
    public final ssw<Boolean> a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final ssw<String> openGame;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public meh binding;

    public static final class a implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public a(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeaturedGamesRouter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.a = new ssw<>();
        this.openGame = new ssw<>();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.featured_games_container, (ViewGroup) this, false);
        addView(viewInflate);
        FeaturedGames featuredGames = (FeaturedGames) h5e.a(R.id.games, viewInflate);
        if (featuredGames != null) {
            this.binding = new meh((ConstraintLayout) viewInflate, featuredGames);
        } else {
            bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.games)));
            throw null;
        }
    }

    public final meh getBinding() {
        return this.binding;
    }

    public final ssw<String> getOpenGame() {
        return this.openGame;
    }

    public final void setBinding(meh mehVar) {
        mehVar.getClass();
        this.binding = mehVar;
    }

    public final void setFeaturedGames(CountryCodeName countryCodeName, String languageCode, boolean isForYouEnabled) {
        countryCodeName.getClass();
        languageCode.getClass();
        FeaturedGames featuredGames = this.binding.b;
        String code = countryCodeName.getCode();
        code.getClass();
        try {
            featuredGames.B = isForYouEnabled;
            featuredGames.A = code;
            SportyGamesManager.getInstance().setBaseUrlFeatured(code);
            fq5 fq5Var = featuredGames.e;
            Context context = featuredGames.getContext();
            context.getClass();
            fq5Var.x1(context, b.f("sg_featured_games", "sg_featured_games_categories"), languageCode);
            SportyGamesManager.getInstance().setFeaturedLanguageCode(languageCode);
            featuredGames.a();
        } catch (Exception unused) {
        }
    }

    public final void setGameObserver() {
        this.binding.b.b.g(new a(new Function1() { // from class: oeh
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                this.a.a.j((Boolean) obj);
                return Unit.a;
            }
        }));
        this.binding.b.getOpenGame().g(new a(new Function1() { // from class: peh
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                this.a.openGame.j((String) obj);
                return Unit.a;
            }
        }));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeaturedGamesRouter(Context context) {
        this(context, null);
        context.getClass();
    }
}
