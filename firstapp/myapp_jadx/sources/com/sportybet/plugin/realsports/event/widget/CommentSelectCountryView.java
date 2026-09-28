package com.sportybet.plugin.realsports.event.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sporty.android.common_ui.widgets.CircleImageView;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.PostCommentResponse;
import defpackage.bi50;
import defpackage.bmy;
import defpackage.ct90;
import defpackage.gbn;
import defpackage.h5e;
import defpackage.hd20;
import defpackage.nhd0;
import defpackage.of20;
import defpackage.p88;
import defpackage.psm;
import defpackage.s88;
import defpackage.uqm;
import defpackage.va0;
import defpackage.wm70;
import defpackage.y7b;
import defpackage.ye20;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u00012B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0019\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0013R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/sportybet/plugin/realsports/event/widget/CommentSelectCountryView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/sporty/android/core/model/service/CountryCodeName;", "value", "", "setDefaultSelect", "(Lcom/sporty/android/core/model/service/CountryCodeName;)V", "Lcom/sportybet/plugin/realsports/event/widget/CommentSelectCountryView$a;", "listener", "setListener", "(Lcom/sportybet/plugin/realsports/event/widget/CommentSelectCountryView$a;)V", "I", "Lcom/sportybet/plugin/realsports/event/widget/CommentSelectCountryView$a;", "getOnClickListener", "()Lcom/sportybet/plugin/realsports/event/widget/CommentSelectCountryView$a;", "setOnClickListener", "onClickListener", "Luqm;", "J", "Luqm;", "getAccountHelper", "()Luqm;", "setAccountHelper", "(Luqm;)V", "accountHelper", "Lgbn;", "K", "Lgbn;", "getImageService", "()Lgbn;", "setImageService", "(Lgbn;)V", "imageService", "Lpsm;", "L", "Lpsm;", "getCountryManager", "()Lpsm;", "setCountryManager", "(Lpsm;)V", "countryManager", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CommentSelectCountryView extends Hilt_CommentSelectCountryView implements View.OnClickListener {
    public final nhd0 H;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public a onClickListener;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public uqm accountHelper;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public gbn imageService;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public psm countryManager;

    public interface a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentSelectCountryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spr_comment_selection_country, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R.id.all_country_check_img;
        ImageView imageView = (ImageView) h5e.a(R.id.all_country_check_img, viewInflate);
        if (imageView != null) {
            i2 = R.id.all_country_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.all_country_container, viewInflate);
            if (constraintLayout != null) {
                i2 = R.id.global;
                if (((ImageView) h5e.a(R.id.global, viewInflate)) != null) {
                    i2 = R.id.guideline_begin;
                    if (((Guideline) h5e.a(R.id.guideline_begin, viewInflate)) != null) {
                        i2 = R.id.my_country_check_img;
                        ImageView imageView2 = (ImageView) h5e.a(R.id.my_country_check_img, viewInflate);
                        if (imageView2 != null) {
                            i2 = R.id.my_country_container;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.my_country_container, viewInflate);
                            if (constraintLayout2 != null) {
                                i2 = R.id.my_country_img;
                                CircleImageView circleImageView = (CircleImageView) h5e.a(R.id.my_country_img, viewInflate);
                                if (circleImageView != null) {
                                    i2 = R.id.title;
                                    if (((TextView) h5e.a(R.id.title, viewInflate)) != null) {
                                        this.H = new nhd0((ConstraintLayout) viewInflate, imageView, constraintLayout, imageView2, constraintLayout2, circleImageView);
                                        constraintLayout.setOnClickListener(this);
                                        constraintLayout2.setOnClickListener(this);
                                        if (getCountryManager().r() || getCountryManager().O()) {
                                            getImageService().a(y7b.b(getCountryManager().getCountryCode()), circleImageView);
                                            Unit unit = Unit.a;
                                            return;
                                        }
                                        int iA = y7b.a(getCountryManager().getCountryCode());
                                        Integer numValueOf = iA != -1 ? Integer.valueOf(iA) : null;
                                        if (numValueOf != null) {
                                            circleImageView.setImageResource(numValueOf.intValue());
                                            Unit unit2 = Unit.a;
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final uqm getAccountHelper() {
        uqm uqmVar = this.accountHelper;
        if (uqmVar != null) {
            return uqmVar;
        }
        Intrinsics.n("accountHelper");
        throw null;
    }

    public final psm getCountryManager() {
        psm psmVar = this.countryManager;
        if (psmVar != null) {
            return psmVar;
        }
        Intrinsics.n("countryManager");
        throw null;
    }

    public final gbn getImageService() {
        gbn gbnVar = this.imageService;
        if (gbnVar != null) {
            return gbnVar;
        }
        Intrinsics.n("imageService");
        throw null;
    }

    public final a getOnClickListener() {
        return this.onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String code;
        String code2;
        view.getClass();
        int id = view.getId();
        nhd0 nhd0Var = this.H;
        if (id == R.id.all_country_container) {
            nhd0Var.b.setVisibility(0);
            nhd0Var.c.setVisibility(8);
            a aVar = this.onClickListener;
            if (aVar != null) {
                s88 s88Var = ((p88) aVar).a;
                s88Var.J = null;
                hd20 hd20Var = s88Var.v;
                String str = s88Var.c;
                String str2 = s88Var.I;
                hd20Var.getClass();
                str.getClass();
                str2.getClass();
                of20 of20Var = hd20Var.a.R0;
                if (of20Var != null) {
                    ct90<bi50<PostCommentResponse>> ct90VarB = of20Var.y.d("", "", 0, str, 10, str2, "PRE_MATCH").d(wm70.c).b(va0.a());
                    ye20 ye20Var = new ye20(of20Var);
                    ct90VarB.a(ye20Var);
                    of20Var.x1(ye20Var);
                    return;
                }
                return;
            }
            return;
        }
        if (id == R.id.my_country_container) {
            nhd0Var.b.setVisibility(8);
            nhd0Var.c.setVisibility(0);
            if (getCountryManager().r()) {
                CountryCodeName countryCode = getCountryManager().getCountryCode();
                a aVar2 = this.onClickListener;
                if (aVar2 != null) {
                    s88 s88Var2 = ((p88) aVar2).a;
                    s88Var2.J = countryCode;
                    hd20 hd20Var2 = s88Var2.v;
                    String str3 = s88Var2.c;
                    String str4 = s88Var2.I;
                    hd20Var2.getClass();
                    str3.getClass();
                    str4.getClass();
                    of20 of20Var2 = hd20Var2.a.R0;
                    if (of20Var2 != null) {
                        ct90<bi50<PostCommentResponse>> ct90VarB2 = of20Var2.y.d((countryCode == null || (code2 = countryCode.getCode()) == null) ? "" : code2, "", 0, str3, 10, str4, "PRE_MATCH").d(wm70.c).b(va0.a());
                        ye20 ye20Var2 = new ye20(of20Var2);
                        ct90VarB2.a(ye20Var2);
                        of20Var2.x1(ye20Var2);
                        return;
                    }
                    return;
                }
                return;
            }
            a aVar3 = this.onClickListener;
            if (aVar3 != null) {
                CountryCodeName countryCode2 = getCountryManager().getCountryCode();
                s88 s88Var3 = ((p88) aVar3).a;
                s88Var3.J = countryCode2;
                hd20 hd20Var3 = s88Var3.v;
                String str5 = s88Var3.c;
                String str6 = s88Var3.I;
                hd20Var3.getClass();
                str5.getClass();
                str6.getClass();
                of20 of20Var3 = hd20Var3.a.R0;
                if (of20Var3 != null) {
                    ct90<bi50<PostCommentResponse>> ct90VarB3 = of20Var3.y.d((countryCode2 == null || (code = countryCode2.getCode()) == null) ? "" : code, "", 0, str5, 10, str6, "PRE_MATCH").d(wm70.c).b(va0.a());
                    ye20 ye20Var3 = new ye20(of20Var3);
                    ct90VarB3.a(ye20Var3);
                    of20Var3.x1(ye20Var3);
                }
            }
        }
    }

    public final void setAccountHelper(uqm uqmVar) {
        uqmVar.getClass();
        this.accountHelper = uqmVar;
    }

    public final void setCountryManager(psm psmVar) {
        psmVar.getClass();
        this.countryManager = psmVar;
    }

    public final void setDefaultSelect(CountryCodeName value) {
        nhd0 nhd0Var = this.H;
        if (value == null) {
            nhd0Var.b.setVisibility(0);
        } else {
            nhd0Var.c.setVisibility(0);
        }
    }

    public final void setImageService(gbn gbnVar) {
        gbnVar.getClass();
        this.imageService = gbnVar;
    }

    public final void setListener(a listener) {
        listener.getClass();
        this.onClickListener = listener;
    }

    public final void setOnClickListener(a aVar) {
        this.onClickListener = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentSelectCountryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentSelectCountryView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ CommentSelectCountryView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
