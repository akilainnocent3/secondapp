package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sportybet.android.gp.tz.R;
import com.sportygames.pingpong.remote.models.DetailResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class mj60 extends Dialog {
    public ImageView A;
    public List<DetailResponse> a;
    public i110 b;
    public FloatingActionButton c;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView i;
    public TextView v;
    public TextView w;
    public TextView y;
    public ImageView z;

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.pp_game_limits);
        View viewFindViewById = findViewById(R.id.game_limit_close);
        viewFindViewById.getClass();
        this.c = (FloatingActionButton) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.min_bet_1);
        viewFindViewById2.getClass();
        this.d = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.min_bet_2);
        viewFindViewById3.getClass();
        this.f = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.max_bet_1);
        viewFindViewById4.getClass();
        this.i = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.max_bet_2);
        viewFindViewById5.getClass();
        this.v = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.game_limits_1);
        viewFindViewById6.getClass();
        this.z = (ImageView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.game_limits_2);
        viewFindViewById7.getClass();
        this.A = (ImageView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.text);
        viewFindViewById8.getClass();
        this.e = (TextView) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.note);
        viewFindViewById9.getClass();
        this.y = (TextView) viewFindViewById9;
        View viewFindViewById10 = findViewById(R.id.max_payout);
        viewFindViewById10.getClass();
        this.w = (TextView) viewFindViewById10;
        kj60 kj60Var = new kj60(this);
        FloatingActionButton floatingActionButton = this.c;
        if (floatingActionButton == null) {
            Intrinsics.n("closeButton");
            throw null;
        }
        floatingActionButton.setOnClickListener(new lj60(kj60Var, 0));
        List<DetailResponse> list = this.a;
        if (list == null) {
            Intrinsics.n("detailResponse");
            throw null;
        }
        if (!list.isEmpty()) {
            TextView textView = this.d;
            if (textView == null) {
                Intrinsics.n("minBet1");
                throw null;
            }
            op5 op5Var = op5.a;
            String string = getContext().getString(R.string.min_bet_cms);
            string.getClass();
            String string2 = getContext().getString(R.string.min_bet);
            string2.getClass();
            op5Var.getClass();
            String strB = op5.b(string, string2, null);
            Context context = getContext();
            List<DetailResponse> list2 = this.a;
            if (list2 == null) {
                Intrinsics.n("detailResponse");
                throw null;
            }
            String strI = op5.i(list2.get(0).getCurrency());
            TreeMap treeMap = pw.a;
            List<DetailResponse> list3 = this.a;
            if (list3 == null) {
                Intrinsics.n("detailResponse");
                throw null;
            }
            hu1.b(strB, " ", context.getString(R.string.bet_amount_colan, strI, pw.n(list3.get(0).getMinAmount())), textView);
            TextView textView2 = this.f;
            if (textView2 == null) {
                Intrinsics.n("minBet2");
                throw null;
            }
            String string3 = getContext().getString(R.string.min_bet_cms);
            string3.getClass();
            String string4 = getContext().getString(R.string.min_bet);
            string4.getClass();
            String strB2 = op5.b(string3, string4, null);
            Context context2 = getContext();
            List<DetailResponse> list4 = this.a;
            if (list4 == null) {
                Intrinsics.n("detailResponse");
                throw null;
            }
            String strI2 = op5.i(list4.get(1).getCurrency());
            List<DetailResponse> list5 = this.a;
            if (list5 == null) {
                Intrinsics.n("detailResponse");
                throw null;
            }
            hu1.b(strB2, " ", context2.getString(R.string.bet_amount_colan, strI2, pw.n(list5.get(1).getMinAmount())), textView2);
            TextView textView3 = this.i;
            if (textView3 == null) {
                Intrinsics.n("maxBet1");
                throw null;
            }
            String string5 = getContext().getString(R.string.max_bet_cms);
            string5.getClass();
            String string6 = getContext().getString(R.string.max_bet);
            string6.getClass();
            String strB3 = op5.b(string5, string6, null);
            Context context3 = getContext();
            List<DetailResponse> list6 = this.a;
            if (list6 == null) {
                Intrinsics.n("detailResponse");
                throw null;
            }
            String strI3 = op5.i(list6.get(0).getCurrency());
            List<DetailResponse> list7 = this.a;
            if (list7 == null) {
                Intrinsics.n("detailResponse");
                throw null;
            }
            hu1.b(strB3, " ", context3.getString(R.string.bet_amount_colan, strI3, pw.n(list7.get(0).getMaxAmount())), textView3);
            TextView textView4 = this.v;
            if (textView4 == null) {
                Intrinsics.n("maxBet2");
                throw null;
            }
            String string7 = getContext().getString(R.string.max_bet_cms);
            string7.getClass();
            String string8 = getContext().getString(R.string.max_bet);
            string8.getClass();
            String strB4 = op5.b(string7, string8, null);
            Context context4 = getContext();
            List<DetailResponse> list8 = this.a;
            if (list8 == null) {
                Intrinsics.n("detailResponse");
                throw null;
            }
            String strI4 = op5.i(list8.get(1).getCurrency());
            List<DetailResponse> list9 = this.a;
            if (list9 == null) {
                Intrinsics.n("detailResponse");
                throw null;
            }
            hu1.b(strB4, " ", context4.getString(R.string.bet_amount_colan, strI4, pw.n(list9.get(1).getMaxAmount())), textView4);
            TextView textView5 = this.w;
            if (textView5 == null) {
                Intrinsics.n("maxPayout");
                throw null;
            }
            String string9 = getContext().getString(R.string.max_payout_cms);
            string9.getClass();
            String string10 = getContext().getString(R.string.max_payout);
            string10.getClass();
            String strB5 = op5.b(string9, string10, null);
            Context context5 = getContext();
            List<DetailResponse> list10 = this.a;
            if (list10 == null) {
                Intrinsics.n("detailResponse");
                throw null;
            }
            String strI5 = op5.i(list10.get(0).getCurrency());
            List<DetailResponse> list11 = this.a;
            if (list11 == null) {
                Intrinsics.n("detailResponse");
                throw null;
            }
            hu1.b(strB5, " ", context5.getString(R.string.bet_amount_colan, strI5, pw.n(list11.get(0).getMaxPayoutAmount())), textView5);
        }
        op5 op5Var2 = op5.a;
        TextView textView6 = this.y;
        if (textView6 == null) {
            Intrinsics.n("note");
            throw null;
        }
        TextView textView7 = this.e;
        if (textView7 == null) {
            Intrinsics.n("title");
            throw null;
        }
        op5.r(op5Var2, b.f(textView6, textView7), null, 6);
        ImageView imageView = this.z;
        if (imageView == null) {
            Intrinsics.n("image1");
            throw null;
        }
        ImageView imageView2 = this.A;
        if (imageView2 == null) {
            Intrinsics.n("image2");
            throw null;
        }
        ArrayList arrayListF = b.f(imageView, imageView2);
        ArrayList arrayListF2 = b.f(null, null);
        Context context6 = getContext();
        context6.getClass();
        op5.o(arrayListF, arrayListF2, context6);
    }
}
