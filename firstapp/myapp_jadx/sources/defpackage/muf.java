package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lmuf;", "Lavw;", "Ljuf;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class muf extends avw<juf> {
    public int A;
    public int B;
    public final qfk e;
    public final w8k f;
    public final bt60 i;
    public final qnc v;
    public final w0j0 w;
    public jvd0 y;
    public int z;

    public muf(qfk qfkVar, w8k w8kVar, bt60 bt60Var, qnc qncVar, w0j0 w0j0Var) {
        super(juf.b.a);
        this.e = qfkVar;
        this.f = w8kVar;
        this.i = bt60Var;
        this.v = qncVar;
        this.w = w0j0Var;
    }

    public final Pair<UiText, UiText> A1(String str, String str2) {
        Integer numValueOf;
        cwf0 aVar;
        int i = this.z;
        int i2 = this.A;
        this.v.getClass();
        cwf0 cwf0VarA = qnc.a(i, i2, str);
        cwf0.a aVar2 = cwf0VarA instanceof cwf0.a ? (cwf0.a) cwf0VarA : null;
        int i3 = this.z;
        try {
            numValueOf = Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        int i4 = this.B;
        this.w.getClass();
        str2.getClass();
        if (str2.length() == 0) {
            aVar = cwf0.b.a;
        } else {
            try {
                int i5 = Integer.parseInt(str2);
                if (i5 < i3) {
                    Object[] objArr = {Integer.valueOf(i3)};
                    StringUiText stringUiText = vch0.a;
                    aVar = new cwf0.a(new ResourceUiText(R.string.page_limits__the_minimum_time_limit_that_can_be_set_must_be_vnum_minutes, ay0.S(objArr)));
                } else if (i5 < iIntValue) {
                    StringUiText stringUiText2 = vch0.a;
                    aVar = new cwf0.a(new ResourceUiText(R.string.page_limits__the_amount_must_be_higher_than_the_daily_limit));
                } else if (i5 > i4) {
                    Object[] objArr2 = {Integer.valueOf(i4)};
                    StringUiText stringUiText3 = vch0.a;
                    aVar = new cwf0.a(new ResourceUiText(R.string.page_limits__the_amount_must_be_higher_than_the_weekly_limit, ay0.S(objArr2)));
                } else {
                    aVar = cwf0.b.a;
                }
            } catch (NumberFormatException unused2) {
                StringUiText stringUiText4 = vch0.a;
                aVar = new cwf0.a(new ResourceUiText(R.string.page_limits__invalid_value_error));
            }
        }
        cwf0.a aVar3 = aVar instanceof cwf0.a ? (cwf0.a) aVar : null;
        return new Pair<>(aVar2 != null ? aVar2.a : null, aVar3 != null ? aVar3.a : null);
    }

    public final juf.c z1() {
        Object value = this.a.getValue();
        if (value instanceof juf.c) {
            return (juf.c) value;
        }
        return null;
    }
}
