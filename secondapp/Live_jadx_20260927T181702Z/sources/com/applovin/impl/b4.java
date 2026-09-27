package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class b4 extends t2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final g3 f26568n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Context f26569o;

    public b4(g3 g3Var, Context context) {
        super(t2.c.DETAIL);
        this.f26568n = g3Var;
        this.f26569o = context;
        this.f29202c = t();
        this.f29203d = s();
    }

    private SpannedString q() {
        if (!this.f26568n.z()) {
            return StringUtils.createListItemDetailSpannedString("Adapter Missing", p1.a.f120313c);
        }
        if (TextUtils.isEmpty(this.f26568n.c())) {
            return StringUtils.createListItemDetailSpannedString("Adapter Found", -16777216);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
        spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f26568n.c(), -16777216));
        if (this.f26568n.A()) {
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("  LATEST  ", this.f26569o.getColor(R.color.applovin_sdk_orangeColor)));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f26568n.k(), -16777216));
        }
        if (!this.f26568n.B()) {
            spannableStringBuilder.append((CharSequence) new SpannableString(IOUtils.LINE_SEPARATOR_UNIX));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("INCOMPATIBLE WITH MAX SDK VERSION", p1.a.f120313c));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString s() {
        if (!o()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) u());
        spannableStringBuilder.append((CharSequence) new SpannableString(IOUtils.LINE_SEPARATOR_UNIX));
        spannableStringBuilder.append((CharSequence) q());
        if (this.f26568n.q() == g3.a.INVALID_INTEGRATION) {
            spannableStringBuilder.append((CharSequence) new SpannableString(IOUtils.LINE_SEPARATOR_UNIX));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Invalid Integration", p1.a.f120313c));
        } else if (this.f26568n.q() == g3.a.INCOMPLETE_INTEGRATION && this.f26568n.E()) {
            spannableStringBuilder.append((CharSequence) new SpannableString(IOUtils.LINE_SEPARATOR_UNIX));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Mismatched SDK/Adapter Versions", p1.a.f120313c));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString t() {
        return StringUtils.createSpannedString(this.f26568n.g(), o() ? -16777216 : -7829368, 18, 1);
    }

    private SpannedString u() {
        if (!this.f26568n.F()) {
            return StringUtils.createListItemDetailSpannedString("SDK Missing", p1.a.f120313c);
        }
        if (!StringUtils.isValidString(this.f26568n.p())) {
            return StringUtils.createListItemDetailSpannedString(this.f26568n.z() ? "Retrieving SDK Version..." : "SDK Found", -16777216);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
        spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f26568n.p(), -16777216));
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.t2
    public int d() {
        return o() ? R.drawable.applovin_ic_disclosure_arrow : super.h();
    }

    @Override // com.applovin.impl.t2
    public int e() {
        return this.f26569o.getColor(R.color.applovin_sdk_disclosureButtonColor);
    }

    @Override // com.applovin.impl.t2
    public int h() {
        int iH = this.f26568n.h();
        return iH > 0 ? iH : R.drawable.applovin_ic_mediation_placeholder;
    }

    @Override // com.applovin.impl.t2
    public boolean o() {
        return this.f26568n.q() != g3.a.MISSING;
    }

    public g3 r() {
        return this.f26568n;
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + ((Object) this.f29202c) + ", detailText=" + ((Object) this.f29203d) + ", network=" + this.f26568n + "}";
    }
}
