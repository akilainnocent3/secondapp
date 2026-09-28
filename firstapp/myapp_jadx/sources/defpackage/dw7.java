package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class dw7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final iv7 i;
    public final int j;

    public dw7(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, iv7 iv7Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = iv7Var;
        int iOrdinal = iv7Var.ordinal();
        int i = R.drawable.ic_selection_status_1_up;
        switch (iOrdinal) {
            case 0:
                i = R.drawable.ic_selection_status_not_started;
                break;
            case 1:
                i = R.drawable.ic_selection_status_ongoing;
                break;
            case 2:
            case 12:
                i = R.drawable.ic_selection_status_win;
                break;
            case 3:
                i = R.drawable.ic_selection_status_flashwin;
                break;
            case 4:
                i = R.drawable.ic_selection_status_flashsave;
                break;
            case 5:
            case 8:
                break;
            case 6:
                i = R.drawable.ic_selection_status_2_up;
                break;
            case 7:
                i = R.drawable.ic_selection_status_over_under_early_goals;
                break;
            case 9:
            case 13:
                i = R.drawable.ic_selection_status_lost;
                break;
            case 10:
                i = R.drawable.ic_selection_status_void;
                break;
            case 11:
                i = R.drawable.ic_selection_status_refund_all;
                break;
            default:
                uhc.a();
                throw null;
        }
        this.j = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw7)) {
            return false;
        }
        dw7 dw7Var = (dw7) obj;
        return this.a.equals(dw7Var.a) && this.b.equals(dw7Var.b) && this.c.equals(dw7Var.c) && this.d.equals(dw7Var.d) && this.e.equals(dw7Var.e) && this.f.equals(dw7Var.f) && this.g.equals(dw7Var.g) && this.h.equals(dw7Var.h) && this.i == dw7Var.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("CodeChatSelectionUiModel(selectionId=", this.a, ", sportId=", this.b, ", pickLabel=");
        hxa.c(sbA, this.c, ", marketLabel=", this.d, ", matchLabel=");
        hxa.c(sbA, this.e, ", tournamentIconUrl=", this.f, ", homeTeamIconUrl=");
        hxa.c(sbA, this.g, ", awayTeamIconUrl=", this.h, ", status=");
        sbA.append(this.i);
        sbA.append(")");
        return sbA.toString();
    }
}
