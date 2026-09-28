package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.android.gp.tz.R;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbqi;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bqi extends j8i0 {
    public final zws a;
    public final qoi b;
    public final wwd0 c;

    /* JADX WARN: Code duplicated, block: B:16:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:18:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:20:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:24:0x0118  */
    /* JADX WARN: Code duplicated, block: B:26:0x0122  */
    /* JADX WARN: Code duplicated, block: B:28:0x0128  */
    /* JADX WARN: Code duplicated, block: B:29:0x012a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0139  */
    /* JADX WARN: Code duplicated, block: B:33:0x014c  */
    /* JADX WARN: Code duplicated, block: B:36:0x015c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0167  */
    /* JADX WARN: Code duplicated, block: B:40:0x016f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0179  */
    /* JADX WARN: Code duplicated, block: B:47:0x0189  */
    /* JADX WARN: Code duplicated, block: B:48:0x0194  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:53:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:58:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:63:0x01da  */
    /* JADX WARN: Code duplicated, block: B:64:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e0  */
    public bqi(@Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, zws zwsVar, qoi qoiVar, rpi rpiVar) {
        u75 u75Var;
        Integer num;
        Integer numValueOf;
        Pair pair;
        Pair pair2;
        ResourceUiText resourceUiText;
        ResourceUiText resourceUiText2;
        ResourceUiText resourceUiText3;
        ResourceUiText resourceUiText4;
        ResourceUiText resourceUiText5;
        ResourceUiText resourceUiText6;
        List list;
        zwsVar.getClass();
        rpiVar.getClass();
        this.a = zwsVar;
        this.b = qoiVar;
        String strValueOf = String.valueOf(Calendar.getInstance().get(1));
        psm psmVar = rpiVar.a;
        if (psmVar.W()) {
            StringUiText stringUiText = vch0.a;
            u75Var = new u75(new ResourceUiText(R.string.common_functions__contact_us), b.k(new t75(R.drawable.clock, new ResourceUiText(R.string.main_footer__chat_24_7__BR)), new t75(R.drawable.voice_icon, new ResourceUiText(R.string.br_support_telephone_number)), new t75(R.drawable.icon_email, new ResourceUiText(R.string.common_functions__contact_email__BR))), new ResourceUiText(R.string.main_footer__ombudsman__BR), b.k(new t75(R.drawable.voice_icon, new ResourceUiText(R.string.br_support_telephone_number)), new t75(R.drawable.icon_email, new ResourceUiText(R.string.main_footer__email_ombudsman__BR))));
        } else {
            u75Var = null;
        }
        if (!psmVar.v()) {
            if (psmVar.H()) {
                numValueOf = Integer.valueOf(R.drawable.ic_footer_18_year);
            } else {
                num = null;
            }
            UiText uiTextD = rpiVar.b.d();
            if (psmVar.S()) {
                if (psmVar.x()) {
                    StringUiText stringUiText2 = vch0.a;
                    pair2 = new Pair(new ResourceUiText(R.string.main_footer__paybill_title), new ResourceUiText(R.string.main_footer__paybill_value__GH));
                } else {
                    pair = null;
                }
                StringUiText stringUiText3 = vch0.a;
                ResourceUiText resourceUiText7 = new ResourceUiText(R.string.main_footer__year_copy_right, ay0.S(new Object[]{strValueOf}));
                if (psmVar.W()) {
                    if (psmVar.O()) {
                        resourceUiText2 = null;
                    } else {
                        resourceUiText = new ResourceUiText(R.string.main_footer__payment_methods);
                    }
                    if (psmVar.W()) {
                        resourceUiText3 = new ResourceUiText(R.string.main_footer__year_copy_right__BR, ay0.S(new Object[]{strValueOf}));
                    } else {
                        resourceUiText3 = null;
                    }
                    boolean zW = psmVar.W();
                    boolean zO = psmVar.O();
                    if (psmVar.O()) {
                        resourceUiText4 = new ResourceUiText(R.string.main_footer__mer_gambling_regulations);
                    } else {
                        resourceUiText4 = null;
                    }
                    if (!psmVar.O() || psmVar.W()) {
                        resourceUiText5 = new ResourceUiText(R.string.common_helps__responsible);
                    } else {
                        resourceUiText5 = null;
                    }
                    if (psmVar.O()) {
                        resourceUiText6 = new ResourceUiText(R.string.main_footer__paia);
                    } else {
                        resourceUiText6 = null;
                    }
                    boolean zO2 = psmVar.O();
                    ResourceUiText resourceUiText8 = new ResourceUiText(R.string.main_footer__slogan);
                    boolean zW2 = psmVar.W();
                    switch (npi.b.a[rpiVar.c.a.getCountryCode().ordinal()]) {
                        case 1:
                            list = npi.g;
                            break;
                        case 2:
                            list = npi.b;
                            break;
                        case 3:
                            list = npi.c;
                            break;
                        case 4:
                            list = npi.d;
                            break;
                        case 5:
                            list = npi.e;
                            break;
                        case 6:
                            list = npi.f;
                            break;
                        case 7:
                            list = npi.h;
                            break;
                        case 8:
                            list = m2g.a;
                            break;
                        case 9:
                            list = npi.k;
                            break;
                        case 10:
                            list = npi.l;
                            break;
                        case 11:
                            list = npi.i;
                            break;
                        case 12:
                            list = npi.j;
                            break;
                        default:
                            uhc.a();
                            throw null;
                    }
                    this.c = xwd0.a(new ppi(num, uiTextD, pair, resourceUiText7, resourceUiText2, zW, zO, resourceUiText4, resourceUiText5, resourceUiText6, resourceUiText3, zO2, resourceUiText8, u75Var, zW2, list, 309376));
                    ej5.c(o8i0.d(this), oddVar, null, new aqi(this, null), 2);
                }
                resourceUiText = new ResourceUiText(R.string.main_footer__payment_methods__BR);
                resourceUiText2 = resourceUiText;
                if (psmVar.W()) {
                    resourceUiText3 = new ResourceUiText(R.string.main_footer__year_copy_right__BR, ay0.S(new Object[]{strValueOf}));
                } else {
                    resourceUiText3 = null;
                }
                boolean zW3 = psmVar.W();
                boolean zO3 = psmVar.O();
                if (psmVar.O()) {
                    resourceUiText4 = new ResourceUiText(R.string.main_footer__mer_gambling_regulations);
                } else {
                    resourceUiText4 = null;
                }
                if (psmVar.O()) {
                    resourceUiText5 = new ResourceUiText(R.string.common_helps__responsible);
                } else {
                    resourceUiText5 = new ResourceUiText(R.string.common_helps__responsible);
                }
                if (psmVar.O()) {
                    resourceUiText6 = new ResourceUiText(R.string.main_footer__paia);
                } else {
                    resourceUiText6 = null;
                }
                boolean zO4 = psmVar.O();
                ResourceUiText resourceUiText9 = new ResourceUiText(R.string.main_footer__slogan);
                boolean zW4 = psmVar.W();
                switch (npi.b.a[rpiVar.c.a.getCountryCode().ordinal()]) {
                    case 1:
                        list = npi.g;
                        break;
                    case 2:
                        list = npi.b;
                        break;
                    case 3:
                        list = npi.c;
                        break;
                    case 4:
                        list = npi.d;
                        break;
                    case 5:
                        list = npi.e;
                        break;
                    case 6:
                        list = npi.f;
                        break;
                    case 7:
                        list = npi.h;
                        break;
                    case 8:
                        list = m2g.a;
                        break;
                    case 9:
                        list = npi.k;
                        break;
                    case 10:
                        list = npi.l;
                        break;
                    case 11:
                        list = npi.i;
                        break;
                    case 12:
                        list = npi.j;
                        break;
                    default:
                        uhc.a();
                        throw null;
                }
                this.c = xwd0.a(new ppi(num, uiTextD, pair, resourceUiText7, resourceUiText2, zW3, zO3, resourceUiText4, resourceUiText5, resourceUiText6, resourceUiText3, zO4, resourceUiText9, u75Var, zW4, list, 309376));
                ej5.c(o8i0.d(this), oddVar, null, new aqi(this, null), 2);
            }
            StringUiText stringUiText4 = vch0.a;
            pair2 = new Pair(new ResourceUiText(R.string.main_footer__mpesa_title), new ResourceUiText(R.string.main_footer__mpesa_value__KE));
            pair = pair2;
            StringUiText stringUiText5 = vch0.a;
            ResourceUiText resourceUiText10 = new ResourceUiText(R.string.main_footer__year_copy_right, ay0.S(new Object[]{strValueOf}));
            if (psmVar.W()) {
                if (psmVar.O()) {
                    resourceUiText2 = null;
                } else {
                    resourceUiText = new ResourceUiText(R.string.main_footer__payment_methods);
                }
                if (psmVar.W()) {
                    resourceUiText3 = new ResourceUiText(R.string.main_footer__year_copy_right__BR, ay0.S(new Object[]{strValueOf}));
                } else {
                    resourceUiText3 = null;
                }
                boolean zW5 = psmVar.W();
                boolean zO5 = psmVar.O();
                if (psmVar.O()) {
                    resourceUiText4 = new ResourceUiText(R.string.main_footer__mer_gambling_regulations);
                } else {
                    resourceUiText4 = null;
                }
                if (psmVar.O()) {
                    resourceUiText5 = new ResourceUiText(R.string.common_helps__responsible);
                } else {
                    resourceUiText5 = new ResourceUiText(R.string.common_helps__responsible);
                }
                if (psmVar.O()) {
                    resourceUiText6 = new ResourceUiText(R.string.main_footer__paia);
                } else {
                    resourceUiText6 = null;
                }
                boolean zO6 = psmVar.O();
                ResourceUiText resourceUiText11 = new ResourceUiText(R.string.main_footer__slogan);
                boolean zW6 = psmVar.W();
                switch (npi.b.a[rpiVar.c.a.getCountryCode().ordinal()]) {
                    case 1:
                        list = npi.g;
                        break;
                    case 2:
                        list = npi.b;
                        break;
                    case 3:
                        list = npi.c;
                        break;
                    case 4:
                        list = npi.d;
                        break;
                    case 5:
                        list = npi.e;
                        break;
                    case 6:
                        list = npi.f;
                        break;
                    case 7:
                        list = npi.h;
                        break;
                    case 8:
                        list = m2g.a;
                        break;
                    case 9:
                        list = npi.k;
                        break;
                    case 10:
                        list = npi.l;
                        break;
                    case 11:
                        list = npi.i;
                        break;
                    case 12:
                        list = npi.j;
                        break;
                    default:
                        uhc.a();
                        throw null;
                }
                this.c = xwd0.a(new ppi(num, uiTextD, pair, resourceUiText10, resourceUiText2, zW5, zO5, resourceUiText4, resourceUiText5, resourceUiText6, resourceUiText3, zO6, resourceUiText11, u75Var, zW6, list, 309376));
                ej5.c(o8i0.d(this), oddVar, null, new aqi(this, null), 2);
            }
            resourceUiText = new ResourceUiText(R.string.main_footer__payment_methods__BR);
            resourceUiText2 = resourceUiText;
            if (psmVar.W()) {
                resourceUiText3 = new ResourceUiText(R.string.main_footer__year_copy_right__BR, ay0.S(new Object[]{strValueOf}));
            } else {
                resourceUiText3 = null;
            }
            boolean zW7 = psmVar.W();
            boolean zO7 = psmVar.O();
            if (psmVar.O()) {
                resourceUiText4 = new ResourceUiText(R.string.main_footer__mer_gambling_regulations);
            } else {
                resourceUiText4 = null;
            }
            if (psmVar.O()) {
                resourceUiText5 = new ResourceUiText(R.string.common_helps__responsible);
            } else {
                resourceUiText5 = new ResourceUiText(R.string.common_helps__responsible);
            }
            if (psmVar.O()) {
                resourceUiText6 = new ResourceUiText(R.string.main_footer__paia);
            } else {
                resourceUiText6 = null;
            }
            boolean zO8 = psmVar.O();
            ResourceUiText resourceUiText12 = new ResourceUiText(R.string.main_footer__slogan);
            boolean zW8 = psmVar.W();
            switch (npi.b.a[rpiVar.c.a.getCountryCode().ordinal()]) {
                case 1:
                    list = npi.g;
                    break;
                case 2:
                    list = npi.b;
                    break;
                case 3:
                    list = npi.c;
                    break;
                case 4:
                    list = npi.d;
                    break;
                case 5:
                    list = npi.e;
                    break;
                case 6:
                    list = npi.f;
                    break;
                case 7:
                    list = npi.h;
                    break;
                case 8:
                    list = m2g.a;
                    break;
                case 9:
                    list = npi.k;
                    break;
                case 10:
                    list = npi.l;
                    break;
                case 11:
                    list = npi.i;
                    break;
                case 12:
                    list = npi.j;
                    break;
                default:
                    uhc.a();
                    throw null;
            }
            this.c = xwd0.a(new ppi(num, uiTextD, pair, resourceUiText10, resourceUiText2, zW7, zO7, resourceUiText4, resourceUiText5, resourceUiText6, resourceUiText3, zO8, resourceUiText12, u75Var, zW8, list, 309376));
            ej5.c(o8i0.d(this), oddVar, null, new aqi(this, null), 2);
        }
        numValueOf = Integer.valueOf(R.drawable.ic_footer_21_year);
        num = numValueOf;
        UiText uiTextD2 = rpiVar.b.d();
        if (psmVar.S()) {
            if (psmVar.x()) {
                StringUiText stringUiText6 = vch0.a;
                pair2 = new Pair(new ResourceUiText(R.string.main_footer__paybill_title), new ResourceUiText(R.string.main_footer__paybill_value__GH));
            } else {
                pair = null;
            }
            StringUiText stringUiText7 = vch0.a;
            ResourceUiText resourceUiText13 = new ResourceUiText(R.string.main_footer__year_copy_right, ay0.S(new Object[]{strValueOf}));
            if (psmVar.W()) {
                if (psmVar.O()) {
                    resourceUiText2 = null;
                } else {
                    resourceUiText = new ResourceUiText(R.string.main_footer__payment_methods);
                }
                if (psmVar.W()) {
                    resourceUiText3 = new ResourceUiText(R.string.main_footer__year_copy_right__BR, ay0.S(new Object[]{strValueOf}));
                } else {
                    resourceUiText3 = null;
                }
                boolean zW9 = psmVar.W();
                boolean zO9 = psmVar.O();
                if (psmVar.O()) {
                    resourceUiText4 = new ResourceUiText(R.string.main_footer__mer_gambling_regulations);
                } else {
                    resourceUiText4 = null;
                }
                if (psmVar.O()) {
                    resourceUiText5 = new ResourceUiText(R.string.common_helps__responsible);
                } else {
                    resourceUiText5 = new ResourceUiText(R.string.common_helps__responsible);
                }
                if (psmVar.O()) {
                    resourceUiText6 = new ResourceUiText(R.string.main_footer__paia);
                } else {
                    resourceUiText6 = null;
                }
                boolean zO10 = psmVar.O();
                ResourceUiText resourceUiText14 = new ResourceUiText(R.string.main_footer__slogan);
                boolean zW10 = psmVar.W();
                switch (npi.b.a[rpiVar.c.a.getCountryCode().ordinal()]) {
                    case 1:
                        list = npi.g;
                        break;
                    case 2:
                        list = npi.b;
                        break;
                    case 3:
                        list = npi.c;
                        break;
                    case 4:
                        list = npi.d;
                        break;
                    case 5:
                        list = npi.e;
                        break;
                    case 6:
                        list = npi.f;
                        break;
                    case 7:
                        list = npi.h;
                        break;
                    case 8:
                        list = m2g.a;
                        break;
                    case 9:
                        list = npi.k;
                        break;
                    case 10:
                        list = npi.l;
                        break;
                    case 11:
                        list = npi.i;
                        break;
                    case 12:
                        list = npi.j;
                        break;
                    default:
                        uhc.a();
                        throw null;
                }
                this.c = xwd0.a(new ppi(num, uiTextD2, pair, resourceUiText13, resourceUiText2, zW9, zO9, resourceUiText4, resourceUiText5, resourceUiText6, resourceUiText3, zO10, resourceUiText14, u75Var, zW10, list, 309376));
                ej5.c(o8i0.d(this), oddVar, null, new aqi(this, null), 2);
            }
            resourceUiText = new ResourceUiText(R.string.main_footer__payment_methods__BR);
            resourceUiText2 = resourceUiText;
            if (psmVar.W()) {
                resourceUiText3 = new ResourceUiText(R.string.main_footer__year_copy_right__BR, ay0.S(new Object[]{strValueOf}));
            } else {
                resourceUiText3 = null;
            }
            boolean zW11 = psmVar.W();
            boolean zO11 = psmVar.O();
            if (psmVar.O()) {
                resourceUiText4 = new ResourceUiText(R.string.main_footer__mer_gambling_regulations);
            } else {
                resourceUiText4 = null;
            }
            if (psmVar.O()) {
                resourceUiText5 = new ResourceUiText(R.string.common_helps__responsible);
            } else {
                resourceUiText5 = new ResourceUiText(R.string.common_helps__responsible);
            }
            if (psmVar.O()) {
                resourceUiText6 = new ResourceUiText(R.string.main_footer__paia);
            } else {
                resourceUiText6 = null;
            }
            boolean zO12 = psmVar.O();
            ResourceUiText resourceUiText15 = new ResourceUiText(R.string.main_footer__slogan);
            boolean zW12 = psmVar.W();
            switch (npi.b.a[rpiVar.c.a.getCountryCode().ordinal()]) {
                case 1:
                    list = npi.g;
                    break;
                case 2:
                    list = npi.b;
                    break;
                case 3:
                    list = npi.c;
                    break;
                case 4:
                    list = npi.d;
                    break;
                case 5:
                    list = npi.e;
                    break;
                case 6:
                    list = npi.f;
                    break;
                case 7:
                    list = npi.h;
                    break;
                case 8:
                    list = m2g.a;
                    break;
                case 9:
                    list = npi.k;
                    break;
                case 10:
                    list = npi.l;
                    break;
                case 11:
                    list = npi.i;
                    break;
                case 12:
                    list = npi.j;
                    break;
                default:
                    uhc.a();
                    throw null;
            }
            this.c = xwd0.a(new ppi(num, uiTextD2, pair, resourceUiText13, resourceUiText2, zW11, zO11, resourceUiText4, resourceUiText5, resourceUiText6, resourceUiText3, zO12, resourceUiText15, u75Var, zW12, list, 309376));
            ej5.c(o8i0.d(this), oddVar, null, new aqi(this, null), 2);
        }
        StringUiText stringUiText8 = vch0.a;
        pair2 = new Pair(new ResourceUiText(R.string.main_footer__mpesa_title), new ResourceUiText(R.string.main_footer__mpesa_value__KE));
        pair = pair2;
        StringUiText stringUiText9 = vch0.a;
        ResourceUiText resourceUiText16 = new ResourceUiText(R.string.main_footer__year_copy_right, ay0.S(new Object[]{strValueOf}));
        if (psmVar.W()) {
            if (psmVar.O()) {
                resourceUiText2 = null;
            } else {
                resourceUiText = new ResourceUiText(R.string.main_footer__payment_methods);
            }
            if (psmVar.W()) {
                resourceUiText3 = new ResourceUiText(R.string.main_footer__year_copy_right__BR, ay0.S(new Object[]{strValueOf}));
            } else {
                resourceUiText3 = null;
            }
            boolean zW13 = psmVar.W();
            boolean zO13 = psmVar.O();
            if (psmVar.O()) {
                resourceUiText4 = new ResourceUiText(R.string.main_footer__mer_gambling_regulations);
            } else {
                resourceUiText4 = null;
            }
            if (psmVar.O()) {
                resourceUiText5 = new ResourceUiText(R.string.common_helps__responsible);
            } else {
                resourceUiText5 = new ResourceUiText(R.string.common_helps__responsible);
            }
            if (psmVar.O()) {
                resourceUiText6 = new ResourceUiText(R.string.main_footer__paia);
            } else {
                resourceUiText6 = null;
            }
            boolean zO14 = psmVar.O();
            ResourceUiText resourceUiText17 = new ResourceUiText(R.string.main_footer__slogan);
            boolean zW14 = psmVar.W();
            switch (npi.b.a[rpiVar.c.a.getCountryCode().ordinal()]) {
                case 1:
                    list = npi.g;
                    break;
                case 2:
                    list = npi.b;
                    break;
                case 3:
                    list = npi.c;
                    break;
                case 4:
                    list = npi.d;
                    break;
                case 5:
                    list = npi.e;
                    break;
                case 6:
                    list = npi.f;
                    break;
                case 7:
                    list = npi.h;
                    break;
                case 8:
                    list = m2g.a;
                    break;
                case 9:
                    list = npi.k;
                    break;
                case 10:
                    list = npi.l;
                    break;
                case 11:
                    list = npi.i;
                    break;
                case 12:
                    list = npi.j;
                    break;
                default:
                    uhc.a();
                    throw null;
            }
            this.c = xwd0.a(new ppi(num, uiTextD2, pair, resourceUiText16, resourceUiText2, zW13, zO13, resourceUiText4, resourceUiText5, resourceUiText6, resourceUiText3, zO14, resourceUiText17, u75Var, zW14, list, 309376));
            ej5.c(o8i0.d(this), oddVar, null, new aqi(this, null), 2);
        }
        resourceUiText = new ResourceUiText(R.string.main_footer__payment_methods__BR);
        resourceUiText2 = resourceUiText;
        if (psmVar.W()) {
            resourceUiText3 = new ResourceUiText(R.string.main_footer__year_copy_right__BR, ay0.S(new Object[]{strValueOf}));
        } else {
            resourceUiText3 = null;
        }
        boolean zW15 = psmVar.W();
        boolean zO15 = psmVar.O();
        if (psmVar.O()) {
            resourceUiText4 = new ResourceUiText(R.string.main_footer__mer_gambling_regulations);
        } else {
            resourceUiText4 = null;
        }
        if (psmVar.O()) {
            resourceUiText5 = new ResourceUiText(R.string.common_helps__responsible);
        } else {
            resourceUiText5 = new ResourceUiText(R.string.common_helps__responsible);
        }
        if (psmVar.O()) {
            resourceUiText6 = new ResourceUiText(R.string.main_footer__paia);
        } else {
            resourceUiText6 = null;
        }
        boolean zO16 = psmVar.O();
        ResourceUiText resourceUiText18 = new ResourceUiText(R.string.main_footer__slogan);
        boolean zW16 = psmVar.W();
        switch (npi.b.a[rpiVar.c.a.getCountryCode().ordinal()]) {
            case 1:
                list = npi.g;
                break;
            case 2:
                list = npi.b;
                break;
            case 3:
                list = npi.c;
                break;
            case 4:
                list = npi.d;
                break;
            case 5:
                list = npi.e;
                break;
            case 6:
                list = npi.f;
                break;
            case 7:
                list = npi.h;
                break;
            case 8:
                list = m2g.a;
                break;
            case 9:
                list = npi.k;
                break;
            case 10:
                list = npi.l;
                break;
            case 11:
                list = npi.i;
                break;
            case 12:
                list = npi.j;
                break;
            default:
                uhc.a();
                throw null;
        }
        this.c = xwd0.a(new ppi(num, uiTextD2, pair, resourceUiText16, resourceUiText2, zW15, zO15, resourceUiText4, resourceUiText5, resourceUiText6, resourceUiText3, zO16, resourceUiText18, u75Var, zW16, list, 309376));
        ej5.c(o8i0.d(this), oddVar, null, new aqi(this, null), 2);
    }
}
