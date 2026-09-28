package defpackage;

import com.google.protobuf.Reader;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.realsports.StakeConfig;
import com.sportybet.android.account.international.data.model.PostalCodeResponse;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lpm00;", "Lavw;", "Lhm00;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class pm00 extends avw<hm00> {
    public final gx40 A;
    public final qnc B;
    public final hrd0 C;
    public jvd0 D;
    public int E;
    public int F;
    public final l6a0 e;
    public final vu60 f;
    public final b6k i;
    public final vce0 v;
    public final fck w;
    public final w8k y;
    public final qfk z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm00(l6a0 l6a0Var, vu60 vu60Var, b6k b6kVar, vce0 vce0Var, fck fckVar, w8k w8kVar, qfk qfkVar, gx40 gx40Var, qnc qncVar, hrd0 hrd0Var) {
        Object value;
        Object value2;
        ijf0 ijf0Var;
        ijf0 ijf0Var2;
        ijf0 ijf0Var3;
        ResourceUiText resourceUiText;
        String string;
        super(new hm00(0));
        vu60Var.getClass();
        gx40Var.getClass();
        hrd0Var.getClass();
        this.e = l6a0Var;
        this.f = vu60Var;
        this.i = b6kVar;
        this.v = vce0Var;
        this.w = fckVar;
        this.y = w8kVar;
        this.z = qfkVar;
        this.A = gx40Var;
        this.B = qncVar;
        this.C = hrd0Var;
        this.E = 5;
        this.F = Reader.READ_DONE;
        wwd0 wwd0Var = this.a;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, hm00.a((hm00) value, A1().d, A1().e, new ijf0(A1().g, 0L, 6), new ijf0(A1().h, 0L, 6), new ijf0(A1().f, 0L, 6), null, A1().i, false, false, false, null, null, null, null, null, null, null, null, null, 524192)));
        StakeConfig stakeConfigY = this.C.y();
        String strValueOf = String.valueOf(stakeConfigY.getBettorLimitLossDefault().intValue());
        String strValueOf2 = String.valueOf(stakeConfigY.getBettorLimitTimeDefault());
        wwd0 wwd0Var2 = this.a;
        do {
            value2 = wwd0Var2.getValue();
            ijf0Var = new ijf0(strValueOf, 0L, 6);
            ijf0Var2 = new ijf0(strValueOf, 0L, 6);
            ijf0Var3 = new ijf0(strValueOf2, 0L, 6);
            String string2 = stakeConfigY.getMinStake().toString();
            string2.getClass();
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(R.string.page_limits__min_vnum, ay0.S(new Object[]{string2}));
            string = stakeConfigY.getMinStake().toString();
            string.getClass();
        } while (!wwd0Var2.g(value2, hm00.a((hm00) value2, null, null, null, null, null, null, null, false, false, false, ijf0Var, resourceUiText, null, ijf0Var2, new ResourceUiText(R.string.page_limits__min_vnum, ay0.S(new Object[]{string})), null, ijf0Var3, null, null, 431103)));
        ej5.c(o8i0.d(this), null, null, new lm00(this, null), 3);
    }

    public final ll00 A1() {
        String str;
        String str2;
        String str3;
        vu60 vu60Var = this.f;
        vu60Var.getClass();
        if (!vu60Var.a("email")) {
            hb5.a("Required argument \"email\" is missing and does not have an android:defaultValue");
            return null;
        }
        String str4 = (String) vu60Var.b("email");
        if (str4 == null) {
            hb5.a("Argument \"email\" is marked as non-null but was passed a null value");
            return null;
        }
        if (!vu60Var.a("cpf")) {
            hb5.a("Required argument \"cpf\" is missing and does not have an android:defaultValue");
            return null;
        }
        String str5 = (String) vu60Var.b("cpf");
        if (str5 == null) {
            hb5.a("Argument \"cpf\" is marked as non-null but was passed a null value");
            return null;
        }
        if (!vu60Var.a("password")) {
            hb5.a("Required argument \"password\" is missing and does not have an android:defaultValue");
            return null;
        }
        String str6 = (String) vu60Var.b("password");
        if (str6 == null) {
            hb5.a("Argument \"password\" is marked as non-null but was passed a null value");
            return null;
        }
        if (!vu60Var.a("fullName")) {
            hb5.a("Required argument \"fullName\" is missing and does not have an android:defaultValue");
            return null;
        }
        String str7 = (String) vu60Var.b("fullName");
        if (str7 == null) {
            hb5.a("Argument \"fullName\" is marked as non-null but was passed a null value");
            return null;
        }
        if (!vu60Var.a("dob")) {
            hb5.a("Required argument \"dob\" is missing and does not have an android:defaultValue");
            return null;
        }
        String str8 = (String) vu60Var.b("dob");
        if (str8 == null) {
            hb5.a("Argument \"dob\" is marked as non-null but was passed a null value");
            return null;
        }
        String str9 = "";
        if (vu60Var.a("zipcode")) {
            String str10 = (String) vu60Var.b("zipcode");
            if (str10 == null) {
                hb5.a("Argument \"zipcode\" is marked as non-null but was passed a null value");
                return null;
            }
            str = str10;
        } else {
            str = "";
        }
        if (vu60Var.a("street")) {
            String str11 = (String) vu60Var.b("street");
            if (str11 == null) {
                hb5.a("Argument \"street\" is marked as non-null but was passed a null value");
                return null;
            }
            str2 = str11;
        } else {
            str2 = "";
        }
        if (vu60Var.a("city")) {
            String str12 = (String) vu60Var.b("city");
            if (str12 == null) {
                hb5.a("Argument \"city\" is marked as non-null but was passed a null value");
                return null;
            }
            str3 = str12;
        } else {
            str3 = "";
        }
        if (!vu60Var.a("state") || (str9 = (String) vu60Var.b("state")) != null) {
            return new ll00(str4, str5, str6, str7, str8, str, str2, str3, str9);
        }
        hb5.a("Argument \"state\" is marked as non-null but was passed a null value");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object z1(String str, x1b x1bVar) {
        im00 im00Var;
        SprThrowable sprThrowableH;
        Object value;
        Object value2;
        Object value3;
        hm00 hm00Var;
        String str2;
        ijf0 ijf0Var;
        String city;
        if (x1bVar instanceof im00) {
            im00Var = (im00) x1bVar;
            int i = im00Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                im00Var.c = i - Integer.MIN_VALUE;
            } else {
                im00Var = new im00(this, x1bVar);
            }
        } else {
            im00Var = new im00(this, x1bVar);
        }
        Object objA = im00Var.a;
        y5b y5bVar = y5b.a;
        int i2 = im00Var.c;
        if (i2 == 0) {
            uj50.b(objA);
            im00Var.c = 1;
            objA = s0i.a(new sl50(bm50.b(this.w.a.d(str), vch0.b)), im00Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        lk50 lk50Var = (lk50) objA;
        boolean z = lk50Var instanceof lk50.c;
        wwd0 wwd0Var = this.a;
        if (z) {
            PostalCodeResponse postalCodeResponse = (PostalCodeResponse) ((lk50.c) lk50Var).a;
            if (postalCodeResponse.getFound()) {
                do {
                    value3 = wwd0Var.getValue();
                    hm00Var = (hm00) value3;
                    String state = postalCodeResponse.getState();
                    str2 = state == null ? "" : state;
                    String street = postalCodeResponse.getStreet();
                    if (street == null) {
                        street = "";
                    }
                    ijf0Var = new ijf0(street, 0L, 6);
                    city = postalCodeResponse.getCity();
                } while (!wwd0Var.g(value3, hm00.a(hm00Var, null, null, ijf0Var, new ijf0(city != null ? city : "", 0L, 6), null, null, str2, false, false, false, null, null, null, null, null, null, null, null, null, 524211)));
            }
        } else if ((lk50Var instanceof lk50.a) && (sprThrowableH = bm50.h(lk50Var)) != null && sprThrowableH.getD() == 13002) {
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, hm00.a((hm00) value, null, null, null, null, null, ((lk50.a) lk50Var).b, null, false, false, false, null, null, null, null, null, null, null, null, null, 524255)));
        }
        do {
            value2 = wwd0Var.getValue();
        } while (!wwd0Var.g(value2, hm00.a((hm00) value2, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, 524159)));
        return Unit.a;
    }
}
