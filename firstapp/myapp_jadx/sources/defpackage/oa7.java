package defpackage;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.chat.remote.models.ChatListResponse;
import com.sportygames.commons.chat.views.ChatActivity;
import com.twilio.voice.EventKeys;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class oa7 extends RecyclerView.f<RecyclerView.d0> {
    public ChatActivity a;
    public List<ChatListResponse> b;
    public String c;
    public c28 d;
    public y720 e;
    public ibs f;
    public i97 i;

    public final class a extends RecyclerView.d0 {
        public final TextView A;
        public final TextView B;
        public final TextView C;
        public final CardView D;
        public final ConstraintLayout E;
        public final TextView F;
        public final ImageView G;
        public final ImageView H;
        public final LinearLayout I;
        public final LinearLayout J;
        public final ImageView a;
        public final ImageView b;
        public final ImageView c;
        public final TextView d;
        public final TextView e;
        public final TextView f;
        public final TextView i;
        public final TextView v;
        public final TextView w;
        public final TextView y;
        public final TextView z;

        public a(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.user_image);
            viewFindViewById.getClass();
            this.a = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.image);
            viewFindViewById2.getClass();
            this.b = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.bot_image);
            viewFindViewById3.getClass();
            this.c = (ImageView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.bot_name);
            viewFindViewById4.getClass();
            this.d = (TextView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R.id.cashed_out_text);
            viewFindViewById5.getClass();
            this.e = (TextView) viewFindViewById5;
            View viewFindViewById6 = view.findViewById(R.id.win_text);
            viewFindViewById6.getClass();
            this.f = (TextView) viewFindViewById6;
            View viewFindViewById7 = view.findViewById(R.id.round_text);
            viewFindViewById7.getClass();
            this.i = (TextView) viewFindViewById7;
            View viewFindViewById8 = view.findViewById(R.id.bet_text);
            viewFindViewById8.getClass();
            this.v = (TextView) viewFindViewById8;
            View viewFindViewById9 = view.findViewById(R.id.bot_message);
            viewFindViewById9.getClass();
            this.w = (TextView) viewFindViewById9;
            View viewFindViewById10 = view.findViewById(R.id.user_name);
            viewFindViewById10.getClass();
            this.y = (TextView) viewFindViewById10;
            View viewFindViewById11 = view.findViewById(R.id.coefficient);
            viewFindViewById11.getClass();
            this.z = (TextView) viewFindViewById11;
            View viewFindViewById12 = view.findViewById(R.id.win_amount);
            viewFindViewById12.getClass();
            this.A = (TextView) viewFindViewById12;
            View viewFindViewById13 = view.findViewById(R.id.round);
            viewFindViewById13.getClass();
            this.B = (TextView) viewFindViewById13;
            View viewFindViewById14 = view.findViewById(R.id.bet_amount);
            viewFindViewById14.getClass();
            this.C = (TextView) viewFindViewById14;
            View viewFindViewById15 = view.findViewById(R.id.json_layout);
            viewFindViewById15.getClass();
            this.D = (CardView) viewFindViewById15;
            View viewFindViewById16 = view.findViewById(R.id.gif_text_layout);
            viewFindViewById16.getClass();
            this.E = (ConstraintLayout) viewFindViewById16;
            View viewFindViewById17 = view.findViewById(R.id.name);
            viewFindViewById17.getClass();
            this.F = (TextView) viewFindViewById17;
            View viewFindViewById18 = view.findViewById(R.id.gif_item);
            viewFindViewById18.getClass();
            this.G = (ImageView) viewFindViewById18;
            View viewFindViewById19 = view.findViewById(R.id.rocket_image);
            viewFindViewById19.getClass();
            this.H = (ImageView) viewFindViewById19;
            View viewFindViewById20 = view.findViewById(R.id.background_header);
            viewFindViewById20.getClass();
            this.I = (LinearLayout) viewFindViewById20;
            View viewFindViewById21 = view.findViewById(R.id.background_body);
            viewFindViewById21.getClass();
            this.J = (LinearLayout) viewFindViewById21;
        }
    }

    public final class b extends RecyclerView.d0 {
        public final LinearLayout A;
        public final TextView B;
        public final ImageView C;
        public final TextView D;
        public final TextView E;
        public final TextView F;
        public final TextView G;
        public final ImageView a;
        public final ImageView b;
        public final ImageView c;
        public final TextView d;
        public final TextView e;
        public final TextView f;
        public final TextView i;
        public final TextView v;
        public final TextView w;
        public final TextView y;
        public final CardView z;

        public b(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.user_image);
            viewFindViewById.getClass();
            this.a = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.image);
            viewFindViewById2.getClass();
            this.b = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.bot_image);
            viewFindViewById3.getClass();
            this.c = (ImageView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.bot_name);
            viewFindViewById4.getClass();
            this.d = (TextView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R.id.bot_message);
            viewFindViewById5.getClass();
            this.e = (TextView) viewFindViewById5;
            View viewFindViewById6 = view.findViewById(R.id.user_name);
            viewFindViewById6.getClass();
            this.f = (TextView) viewFindViewById6;
            View viewFindViewById7 = view.findViewById(R.id.coefficient);
            viewFindViewById7.getClass();
            this.i = (TextView) viewFindViewById7;
            View viewFindViewById8 = view.findViewById(R.id.win_amount);
            viewFindViewById8.getClass();
            this.v = (TextView) viewFindViewById8;
            View viewFindViewById9 = view.findViewById(R.id.round);
            viewFindViewById9.getClass();
            this.w = (TextView) viewFindViewById9;
            View viewFindViewById10 = view.findViewById(R.id.bet_amount);
            viewFindViewById10.getClass();
            this.y = (TextView) viewFindViewById10;
            View viewFindViewById11 = view.findViewById(R.id.json_layout);
            viewFindViewById11.getClass();
            this.z = (CardView) viewFindViewById11;
            View viewFindViewById12 = view.findViewById(R.id.gif_text_layout);
            viewFindViewById12.getClass();
            this.A = (LinearLayout) viewFindViewById12;
            View viewFindViewById13 = view.findViewById(R.id.name);
            viewFindViewById13.getClass();
            this.B = (TextView) viewFindViewById13;
            View viewFindViewById14 = view.findViewById(R.id.gif_item);
            viewFindViewById14.getClass();
            this.C = (ImageView) viewFindViewById14;
            View viewFindViewById15 = view.findViewById(R.id.cashed_out_text);
            viewFindViewById15.getClass();
            this.D = (TextView) viewFindViewById15;
            View viewFindViewById16 = view.findViewById(R.id.win_text);
            viewFindViewById16.getClass();
            this.E = (TextView) viewFindViewById16;
            View viewFindViewById17 = view.findViewById(R.id.round_text);
            viewFindViewById17.getClass();
            this.F = (TextView) viewFindViewById17;
            View viewFindViewById18 = view.findViewById(R.id.bet_text);
            viewFindViewById18.getClass();
            this.G = (TextView) viewFindViewById18;
        }
    }

    @c0d(c = "com.sportygames.chat.views.adapter.ChatListAdapter$onBindViewHolder$10", f = "ChatListAdapter.kt", l = {1462, 1469, 1476}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public ImageView a;
        public int b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ a d;
        public final /* synthetic */ oa7 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JSONObject jSONObject, a aVar, oa7 oa7Var, v1b v1bVar) {
            super(2, v1bVar);
            this.c = jSONObject;
            this.d = aVar;
            this.e = oa7Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
        
            if (r8 == r2) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
        
            if (r8 == r2) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
        
            if (r8 == r2) goto L26;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws org.json.JSONException {
            /*
                r7 = this;
                oa7$a r0 = r7.d
                android.widget.ImageView r0 = r0.H
                oa7 r1 = r7.e
                com.sportygames.commons.chat.views.ChatActivity r1 = r1.a
                y5b r2 = defpackage.y5b.a
                int r3 = r7.b
                r4 = 3
                r5 = 2
                r6 = 1
                if (r3 == 0) goto L30
                if (r3 == r6) goto L2a
                if (r3 == r5) goto L24
                if (r3 != r4) goto L1d
                android.widget.ImageView r0 = r7.a
                defpackage.uj50.b(r8)
                goto L84
            L1d:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                r7 = 0
                return r7
            L24:
                android.widget.ImageView r0 = r7.a
                defpackage.uj50.b(r8)
                goto L6f
            L2a:
                android.widget.ImageView r0 = r7.a
                defpackage.uj50.b(r8)
                goto L52
            L30:
                defpackage.uj50.b(r8)
                org.json.JSONObject r8 = r7.c
                java.lang.String r3 = "rocketType"
                java.lang.String r8 = r8.getString(r3)
                java.lang.String r3 = "RED"
                boolean r3 = kotlin.jvm.internal.Intrinsics.g(r8, r3)
                if (r3 == 0) goto L58
                s4u<java.lang.String, android.graphics.Bitmap> r8 = defpackage.r9n.a
                r7.a = r0
                r7.b = r6
                java.lang.String r8 = "red_rocket_with_fire_png"
                java.lang.Object r8 = defpackage.r9n.c(r7, r1, r8)
                if (r8 != r2) goto L52
                goto L83
            L52:
                android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
                r0.setImageBitmap(r8)
                goto L89
            L58:
                java.lang.String r3 = "PURPLE"
                boolean r8 = kotlin.jvm.internal.Intrinsics.g(r8, r3)
                if (r8 == 0) goto L75
                s4u<java.lang.String, android.graphics.Bitmap> r8 = defpackage.r9n.a
                r7.a = r0
                r7.b = r5
                java.lang.String r8 = "purple_rocket_with_fire_png"
                java.lang.Object r8 = defpackage.r9n.c(r7, r1, r8)
                if (r8 != r2) goto L6f
                goto L83
            L6f:
                android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
                r0.setImageBitmap(r8)
                goto L89
            L75:
                s4u<java.lang.String, android.graphics.Bitmap> r8 = defpackage.r9n.a
                r7.a = r0
                r7.b = r4
                java.lang.String r8 = "blue_rocket_with_fire_png"
                java.lang.Object r8 = defpackage.r9n.c(r7, r1, r8)
                if (r8 != r2) goto L84
            L83:
                return r2
            L84:
                android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
                r0.setImageBitmap(r8)
            L89:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: oa7.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.chat.views.adapter.ChatListAdapter$onBindViewHolder$8", f = "ChatListAdapter.kt", l = {1260, 1267, 1274}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public ImageView a;
        public int b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ a d;
        public final /* synthetic */ oa7 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JSONObject jSONObject, a aVar, oa7 oa7Var, v1b v1bVar) {
            super(2, v1bVar);
            this.c = jSONObject;
            this.d = aVar;
            this.e = oa7Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
        
            if (r8 == r2) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
        
            if (r8 == r2) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
        
            if (r8 == r2) goto L26;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws org.json.JSONException {
            /*
                r7 = this;
                oa7$a r0 = r7.d
                android.widget.ImageView r0 = r0.H
                oa7 r1 = r7.e
                com.sportygames.commons.chat.views.ChatActivity r1 = r1.a
                y5b r2 = defpackage.y5b.a
                int r3 = r7.b
                r4 = 3
                r5 = 2
                r6 = 1
                if (r3 == 0) goto L30
                if (r3 == r6) goto L2a
                if (r3 == r5) goto L24
                if (r3 != r4) goto L1d
                android.widget.ImageView r0 = r7.a
                defpackage.uj50.b(r8)
                goto L84
            L1d:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                r7 = 0
                return r7
            L24:
                android.widget.ImageView r0 = r7.a
                defpackage.uj50.b(r8)
                goto L6f
            L2a:
                android.widget.ImageView r0 = r7.a
                defpackage.uj50.b(r8)
                goto L52
            L30:
                defpackage.uj50.b(r8)
                org.json.JSONObject r8 = r7.c
                java.lang.String r3 = "rocketType"
                java.lang.String r8 = r8.getString(r3)
                java.lang.String r3 = "RED"
                boolean r3 = kotlin.jvm.internal.Intrinsics.g(r8, r3)
                if (r3 == 0) goto L58
                s4u<java.lang.String, android.graphics.Bitmap> r8 = defpackage.r9n.a
                r7.a = r0
                r7.b = r6
                java.lang.String r8 = "red_rocket_with_fire_png"
                java.lang.Object r8 = defpackage.r9n.c(r7, r1, r8)
                if (r8 != r2) goto L52
                goto L83
            L52:
                android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
                r0.setImageBitmap(r8)
                goto L89
            L58:
                java.lang.String r3 = "PURPLE"
                boolean r8 = kotlin.jvm.internal.Intrinsics.g(r8, r3)
                if (r8 == 0) goto L75
                s4u<java.lang.String, android.graphics.Bitmap> r8 = defpackage.r9n.a
                r7.a = r0
                r7.b = r5
                java.lang.String r8 = "purple_rocket_with_fire_png"
                java.lang.Object r8 = defpackage.r9n.c(r7, r1, r8)
                if (r8 != r2) goto L6f
                goto L83
            L6f:
                android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
                r0.setImageBitmap(r8)
                goto L89
            L75:
                s4u<java.lang.String, android.graphics.Bitmap> r8 = defpackage.r9n.a
                r7.a = r0
                r7.b = r4
                java.lang.String r8 = "blue_rocket_with_fire_png"
                java.lang.Object r8 = defpackage.r9n.c(r7, r1, r8)
                if (r8 != r2) goto L84
            L83:
                return r2
            L84:
                android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
                r0.setImageBitmap(r8)
            L89:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: oa7.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static HashMap i(String str) {
        String strGroup;
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        byte[] bytes = str.getBytes(charsetForName);
        bytes.getClass();
        Charset charsetForName2 = Charset.forName("UTF-8");
        charsetForName2.getClass();
        String str2 = new String(bytes, charsetForName2);
        Pattern patternCompile = Pattern.compile("[\ud83c-\u10fc00-\udfff]+");
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(str2);
        matcher.getClass();
        if (matcher.find()) {
            strGroup = matcher.group();
            strGroup.getClass();
        } else {
            strGroup = "";
        }
        String lowerCase = kotlin.text.c.p(fu5.a("[^a-zA-Z0-9\\s]", StringsKt.t0(kotlin.text.c.p(str, strGroup, "", false)).toString(), ""), " ", "_", false).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return kpu.d(new Pair(lowerCase.concat("_message"), strGroup));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        List<ChatListResponse> list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        String str = this.c;
        if (kotlin.text.c.l(str, "sporty-hero", true) || kotlin.text.c.l(str, "sporty jet", true) || kotlin.text.c.l(str, "galaxy go", true) || kotlin.text.c.l(str, "sporty kick", true) || kotlin.text.c.l(str, "sporty cars", true) || kotlin.text.c.l(str, "crazy rider", true) || kotlin.text.c.l(str, "sporty skills", true)) {
            return 0;
        }
        if (kotlin.text.c.l(str, "rush", true) || kotlin.text.c.l(str, "1 Punch", true)) {
            return 1;
        }
        if (kotlin.text.c.l(str, "Pocket Rockets", true)) {
            return 2;
        }
        kotlin.text.c.l(str, "ping-pong", true);
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:247:0x0a98  */
    /* JADX WARN: Code duplicated, block: B:60:0x02a5  */
    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) throws JSONException {
        ChatListResponse chatListResponse;
        ChatListResponse.UserInfo userInfo;
        ChatListResponse chatListResponse2;
        ChatListResponse.UserInfo userInfo2;
        ChatListResponse chatListResponse3;
        ChatListResponse.UserInfo userInfo3;
        ChatListResponse chatListResponse4;
        ChatListResponse.UserInfo userInfo4;
        String strA;
        String strB;
        ChatListResponse chatListResponse5;
        ChatListResponse.UserInfo userInfo5;
        ChatListResponse chatListResponse6;
        ChatListResponse.UserInfo userInfo6;
        String nickname;
        ChatListResponse chatListResponse7;
        ChatListResponse.UserInfo userInfo7;
        Class cls;
        String strA2;
        String str;
        String str2;
        String strB2;
        ChatListResponse chatListResponse8;
        ChatListResponse chatListResponse9;
        ChatListResponse.UserInfo userInfo8;
        ChatListResponse chatListResponse10;
        ChatListResponse.UserInfo userInfo9;
        ChatListResponse chatListResponse11;
        ChatListResponse.UserInfo userInfo10;
        ChatListResponse chatListResponse12;
        ChatListResponse.UserInfo userInfo11;
        ChatListResponse chatListResponse13;
        ChatListResponse.UserInfo userInfo12;
        ChatListResponse chatListResponse14;
        ChatListResponse.UserInfo userInfo13;
        String nickname2;
        ChatListResponse chatListResponse15;
        ChatListResponse.UserInfo userInfo14;
        Class cls2;
        ChatListResponse chatListResponse16;
        ChatListResponse chatListResponse17;
        ChatListResponse.UserInfo userInfo15;
        ChatListResponse chatListResponse18;
        ChatListResponse.UserInfo userInfo16;
        ChatListResponse chatListResponse19;
        ChatListResponse.UserInfo userInfo17;
        ChatListResponse chatListResponse20;
        ChatListResponse.UserInfo userInfo18;
        String str3;
        String str4;
        TextView textView;
        TextView textView2;
        String str5;
        ImageView imageView;
        String strA3;
        ChatListResponse chatListResponse21;
        ChatListResponse.UserInfo userInfo19;
        ChatListResponse chatListResponse22;
        ChatListResponse.UserInfo userInfo20;
        String nickname3;
        ChatListResponse chatListResponse23;
        ChatListResponse.UserInfo userInfo21;
        Class cls3;
        String strA4;
        String str6;
        int i2;
        int i3;
        ChatListResponse chatListResponse24;
        String str7 = this.c;
        List<ChatListResponse> list = this.b;
        ChatActivity chatActivity = this.a;
        d0Var.getClass();
        try {
            if (d0Var instanceof eb7) {
                JSONObject jSONObject = new JSONObject(String.valueOf((list == null || (chatListResponse24 = list.get(i)) == null) ? null : chatListResponse24.getJsonBody()));
                if (jSONObject.has("jsonBody")) {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.getString("jsonBody"));
                    JSONObject jSONObject3 = new JSONObject(jSONObject.getString("userInfo"));
                    chatActivity.getClass();
                    xa50 xa50VarF = com.bumptech.glide.a.f(chatActivity);
                    xa50VarF.getClass();
                    String string = jSONObject3.getString("avatar");
                    po80 po80Var = new po80(xa50VarF, string, na7.a(xa50VarF, Drawable.class, string), lo80.a);
                    po80Var.a(hb50.E());
                    eb7 eb7Var = (eb7) d0Var;
                    TextView textView3 = eb7Var.z;
                    TextView textView4 = eb7Var.d;
                    po80Var.e(eb7Var.a);
                    if (jSONObject2.has("text")) {
                        CharSequence text = eb7Var.G.getText();
                        text.getClass();
                        for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) SpannableString.valueOf(text).getSpans(0, eb7Var.G.getText().length(), ForegroundColorSpan.class)) {
                            SpannableString.valueOf(text).removeSpan(foregroundColorSpan);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) jSONObject3.getString("nickname"));
                        spannableStringBuilder.append((CharSequence) "   ");
                        spannableStringBuilder.append((CharSequence) jSONObject2.getString("text"));
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(chatActivity.getColor(R.color.chat_username)), 0, jSONObject3.getString("nickname").length(), 33);
                        eb7Var.G.setText(spannableStringBuilder);
                        eb7Var.H.setVisibility(8);
                        eb7Var.E.setVisibility(8);
                        eb7Var.F.setVisibility(0);
                        return;
                    }
                    if (!jSONObject2.has("json")) {
                        if (jSONObject2.has("gif")) {
                            ((eb7) d0Var).E.setVisibility(8);
                            ((eb7) d0Var).F.setVisibility(0);
                            ((eb7) d0Var).G.setText(jSONObject3.getString("nickname"));
                            ((eb7) d0Var).G.setTextColor(chatActivity.getColor(R.color.chat_username));
                            hb50 hb50VarC = new hb50().C(new l060(10));
                            hb50VarC.getClass();
                            hb50 hb50Var = hb50VarC;
                            ((eb7) d0Var).H.setVisibility(0);
                            if (jSONObject2.has("gif")) {
                                xa50 xa50VarF2 = com.bumptech.glide.a.f(chatActivity);
                                xa50VarF2.getClass();
                                String string2 = jSONObject2.getString("gif");
                                ea50 ea50VarP = xa50VarF2.f(Drawable.class).P(string2);
                                ea50VarP.getClass();
                                po80 po80Var2 = new po80(xa50VarF2, string2, ea50VarP, lo80.a);
                                po80Var2.a(hb50Var);
                                po80Var2.f(R.drawable.gif_placeholder);
                                po80Var2.e(((eb7) d0Var).H);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    final JSONObject jSONObject4 = new JSONObject(jSONObject2.getString("json"));
                    eb7Var.E.setVisibility(0);
                    eb7Var.F.setVisibility(8);
                    if (jSONObject4.getBoolean("isBot")) {
                        if (kotlin.text.c.l(str7, "ping pong", true)) {
                            textView4.setText(chatActivity.getString(R.string.ping_pong_Bot));
                        } else if (kotlin.text.c.l(str7, "sporty jet", true)) {
                            textView4.setText("Sporty Jet Bot");
                        } else if (kotlin.text.c.l(str7, "galaxy go", true)) {
                            textView4.setText(chatActivity.getString(R.string.galaxy_go_Bot));
                        } else if (kotlin.text.c.l(str7, "sporty kick", true)) {
                            textView4.setText(chatActivity.getString(R.string.sporty_kick_bot));
                        } else if (kotlin.text.c.l(str7, "sporty cars", true)) {
                            textView4.setText(chatActivity.getString(R.string.sporty_car_bot));
                        } else if (str7 != null && StringsKt.M(str7, "punch", false)) {
                            textView4.setText(chatActivity.getString(R.string.one_punch_Bot));
                        } else if (kotlin.text.c.l(str7, "crazy rider", true)) {
                            textView4.setText(chatActivity.getString(R.string.crazy_rider_bot));
                        } else if (str7 == null || !StringsKt.M(str7, "skills", false)) {
                            textView4.setText(chatActivity.getString(R.string.hero_bot));
                        } else {
                            textView4.setText(chatActivity.getString(R.string.sporty_skills_bot));
                        }
                        eb7Var.c.setImageDrawable(chatActivity.getDrawable(R.drawable.bot_avatar));
                        if (jSONObject4.has(EventKeys.ERROR_MESSAGE)) {
                            String string3 = jSONObject4.getString(EventKeys.ERROR_MESSAGE);
                            string3.getClass();
                            HashMap mapI = i(string3);
                            HashMap map = new HashMap();
                            Set setKeySet = mapI.keySet();
                            setKeySet.getClass();
                            String str8 = (String) mapI.get(CollectionsKt.Q(setKeySet, 0));
                            if (str8 != null) {
                            }
                            Set setKeySet2 = mapI.keySet();
                            setKeySet2.getClass();
                            String str9 = (String) CollectionsKt.Q(setKeySet2, 0);
                            op5 op5Var = op5.a;
                            String strA5 = yk10.a(str9, chatActivity.getString(R.string.sg_chat));
                            String string4 = jSONObject4.getString(EventKeys.ERROR_MESSAGE);
                            string4.getClass();
                            op5Var.getClass();
                            eb7Var.w.setText(op5.b(strA5, string4, map));
                            if (kotlin.text.c.l(str7, "ping pong", true) || kotlin.text.c.l(str7, "one-punch", true)) {
                                LinearLayout linearLayout = eb7Var.I;
                                i2 = R.color.chat_bot_background_header;
                                linearLayout.setBackgroundColor(chatActivity.getColor(R.color.chat_bot_background_header));
                                LinearLayout linearLayout2 = eb7Var.J;
                                i3 = R.color.chat_bot_background_body;
                                linearLayout2.setBackgroundColor(chatActivity.getColor(R.color.chat_bot_background_body));
                                eb7Var.K.setBackgroundColor(chatActivity.getColor(R.color.chat_bot_background_body));
                            } else {
                                i2 = R.color.chat_bot_background_header;
                                i3 = R.color.chat_bot_background_body;
                            }
                        } else {
                            i2 = R.color.chat_bot_background_header;
                            i3 = R.color.chat_bot_background_body;
                        }
                        eb7Var.I.setBackgroundColor(chatActivity.getColor(i2));
                        eb7Var.J.setBackgroundColor(chatActivity.getColor(i3));
                        cls3 = Drawable.class;
                    } else {
                        eb7Var.I.setBackgroundColor(chatActivity.getColor(R.color.chat_background_header));
                        eb7Var.J.setBackgroundColor(chatActivity.getColor(R.color.chat_background_body));
                        textView4.setText(jSONObject3.getString("nickname"));
                        xa50 xa50VarF3 = com.bumptech.glide.a.f(chatActivity);
                        xa50VarF3.getClass();
                        String string5 = jSONObject3.getString("avatar");
                        cls3 = Drawable.class;
                        po80 po80Var3 = new po80(xa50VarF3, string5, na7.a(xa50VarF3, cls3, string5), lo80.a);
                        po80Var3.a(hb50.E());
                        po80Var3.e(eb7Var.c);
                        if (jSONObject4.has(EventKeys.ERROR_MESSAGE)) {
                            eb7Var.w.setText(jSONObject4.getString(EventKeys.ERROR_MESSAGE));
                        }
                        if (kotlin.text.c.l(str7, "ping pong", true)) {
                            eb7Var.I.setBackgroundColor(chatActivity.getColor(R.color.chat_background_header));
                            eb7Var.J.setBackgroundColor(chatActivity.getColor(R.color.chat_background_body));
                            eb7Var.K.setBackgroundColor(chatActivity.getColor(R.color.chat_background_body));
                        }
                    }
                    TextView textView5 = eb7Var.y;
                    String strOptString = jSONObject4.optString("nickName", "");
                    if (strOptString == null) {
                        strOptString = "";
                    }
                    if (strOptString.length() == 0) {
                        strA4 = "";
                    } else if (strOptString.length() == 1) {
                        strA4 = tug.a(strOptString, "***", strOptString);
                    } else {
                        strA4 = strOptString.charAt(0) + "***" + strOptString.charAt(strOptString.length() - 1);
                    }
                    textView5.setText(strA4);
                    if (jSONObject4.has("roundId")) {
                        eb7Var.B.setText(jSONObject4.getString("roundId"));
                    }
                    String strOptString2 = jSONObject4.optString("currency", "");
                    String strOptString3 = jSONObject4.optString("payoutAmount", "");
                    String strOptString4 = jSONObject4.optString("stakeAmount", "");
                    TextView textView6 = eb7Var.C;
                    op5 op5Var2 = op5.a;
                    strOptString2.getClass();
                    op5Var2.getClass();
                    hu1.b(op5.i(strOptString2), " ", strOptString4, textView6);
                    hu1.b(op5.i(strOptString2), " ", strOptString3, eb7Var.A);
                    if (jSONObject4.has("sideBetType") && jSONObject4.has("targetCoefficient")) {
                        double d2 = jSONObject4.getDouble("targetCoefficient");
                        StringBuilder sb = new StringBuilder();
                        sb.append(d2);
                        str6 = "x";
                        sb.append(str6);
                        textView3.setText(sb.toString());
                        eb7Var.e.setTag(chatActivity.getString(R.string.over_under_cms));
                        op5.r(op5Var2, kotlin.collections.b.f(eb7Var.e), null, 4);
                        textView3.setBackground(null);
                        textView3.setPadding(0, 0, 0, 0);
                    } else {
                        str6 = "x";
                    }
                    if (jSONObject4.has("cashOutCoefficient")) {
                        textView3.setText(jSONObject4.getDouble("cashOutCoefficient") + str6);
                        Map<Double, Integer> map2 = m18.a;
                        textView3.setBackgroundTintList(o0b.b(chatActivity, m18.a(jSONObject4.getDouble("cashOutCoefficient"))));
                        textView3.setPadding(20, 6, 20, 6);
                    }
                    if (jSONObject4.has("startCoefficient") && jSONObject4.has("endCoefficient")) {
                        double d3 = jSONObject4.getDouble("startCoefficient");
                        double d4 = jSONObject4.getDouble("endCoefficient");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(d3);
                        sb2.append("x to ");
                        sb2.append(d4);
                        zug.b(sb2, str6, textView3);
                        eb7Var.e.setTag(chatActivity.getString(R.string.range_cms));
                        op5.r(op5Var2, kotlin.collections.b.f(eb7Var.e), null, 4);
                        textView3.setBackground(null);
                        textView3.setPadding(0, 0, 0, 0);
                    }
                    String string6 = jSONObject4.getString("roundId");
                    string6.getClass();
                    long j = Long.parseLong(string6);
                    long j2 = chatActivity.n0;
                    ImageView imageView2 = eb7Var.D;
                    if (j == j2) {
                        imageView2.setImageTintList(o0b.b(chatActivity, R.color.trans_black_color));
                        eb7Var.D.setClickable(false);
                    } else {
                        imageView2.setImageTintList(o0b.b(chatActivity, R.color.sh_green));
                        eb7Var.D.setClickable(true);
                    }
                    eb7Var.D.setOnClickListener(new View.OnClickListener(this) { // from class: la7
                        public final /* synthetic */ oa7 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) throws JSONException {
                            oa7 oa7Var = this.b;
                            ibs ibsVar = oa7Var.f;
                            ChatActivity chatActivity2 = oa7Var.a;
                            JSONObject jSONObject5 = jSONObject4;
                            String str10 = oAudzpbdOhCI.yycWGMtqaiLGtk;
                            if (jSONObject5.has(str10)) {
                                String string7 = jSONObject5.getString(str10);
                                string7.getClass();
                                if (Long.parseLong(string7) == chatActivity2.n0) {
                                    return;
                                }
                            }
                            String str11 = oa7Var.c;
                            i97 i97Var = oa7Var.i;
                            if (c.l(str11, "ping pong", true)) {
                                y720 y720Var = oa7Var.e;
                                String string8 = jSONObject5.getString(str10);
                                string8.getClass();
                                new dt80(chatActivity2, y720Var, ibsVar, string8).a();
                                return;
                            }
                            if (c.l(str11, "sporty jet", true)) {
                                String string9 = jSONObject5.getString(str10);
                                string9.getClass();
                                i97Var.invoke(string9);
                                return;
                            }
                            if (c.l(str11, "galaxy go", true)) {
                                String string10 = jSONObject5.getString(str10);
                                string10.getClass();
                                i97Var.invoke(string10);
                                return;
                            }
                            if (c.l(str11, "sporty kick", true)) {
                                String string11 = jSONObject5.getString(str10);
                                string11.getClass();
                                i97Var.invoke(string11);
                                return;
                            }
                            if (c.l(str11, "sporty cars", true)) {
                                String string12 = jSONObject5.getString(str10);
                                string12.getClass();
                                i97Var.invoke(string12);
                            } else if (c.l(str11, "crazy rider", true)) {
                                String string13 = jSONObject5.getString(str10);
                                string13.getClass();
                                i97Var.invoke(string13);
                            } else if (c.l(str11, "sporty skills", true)) {
                                String string14 = jSONObject5.getString(str10);
                                string14.getClass();
                                i97Var.invoke(string14);
                            } else {
                                c28 c28Var = oa7Var.d;
                                String string15 = jSONObject5.getString(str10);
                                string15.getClass();
                                new et80(chatActivity2, c28Var, ibsVar, string15).a();
                            }
                        }
                    });
                    xa50 xa50VarF4 = com.bumptech.glide.a.f(chatActivity);
                    xa50VarF4.getClass();
                    String string7 = jSONObject4.getString("avatarUrl");
                    po80 po80Var4 = new po80(xa50VarF4, string7, na7.a(xa50VarF4, cls3, string7), lo80.a);
                    po80Var4.a(hb50.E());
                    po80Var4.f(R.drawable.placeholder_s);
                    po80Var4.e(eb7Var.b);
                    op5.r(op5Var2, kotlin.collections.b.f(eb7Var.i, eb7Var.v, eb7Var.f, eb7Var.e), null, 4);
                    return;
                }
                if (jSONObject.has("text")) {
                    eb7 eb7Var2 = (eb7) d0Var;
                    eb7Var2.E.setVisibility(8);
                    eb7Var2.F.setVisibility(0);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((CharSequence) ((list == null || (chatListResponse23 = list.get(i)) == null || (userInfo21 = chatListResponse23.getUserInfo()) == null) ? null : userInfo21.getNickname()));
                    spannableStringBuilder2.append((CharSequence) "   ");
                    spannableStringBuilder2.append((CharSequence) jSONObject.getString("text"));
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(chatActivity.getColor(R.color.chat_username)), 0, (list == null || (chatListResponse22 = list.get(i)) == null || (userInfo20 = chatListResponse22.getUserInfo()) == null || (nickname3 = userInfo20.getNickname()) == null) ? 0 : nickname3.length(), 33);
                    eb7Var2.G.setText(spannableStringBuilder2);
                    eb7Var2.H.setVisibility(8);
                    xa50 xa50VarF5 = com.bumptech.glide.a.f(chatActivity);
                    xa50VarF5.getClass();
                    String avatar = (list == null || (chatListResponse21 = list.get(i)) == null || (userInfo19 = chatListResponse21.getUserInfo()) == null) ? null : userInfo19.getAvatar();
                    po80 po80Var5 = new po80(xa50VarF5, avatar, na7.a(xa50VarF5, Drawable.class, avatar), lo80.a);
                    po80Var5.a(hb50.E());
                    po80Var5.e(eb7Var2.a);
                    return;
                }
                if (!jSONObject.has("json")) {
                    if (jSONObject.has("gif")) {
                        ((eb7) d0Var).E.setVisibility(8);
                        ((eb7) d0Var).F.setVisibility(0);
                        ((eb7) d0Var).G.setText((list == null || (chatListResponse18 = list.get(i)) == null || (userInfo16 = chatListResponse18.getUserInfo()) == null) ? null : userInfo16.getNickname());
                        ((eb7) d0Var).G.setTextColor(chatActivity.getColor(R.color.chat_username));
                        xa50 xa50VarF6 = com.bumptech.glide.a.f(chatActivity);
                        xa50VarF6.getClass();
                        String avatar2 = (list == null || (chatListResponse17 = list.get(i)) == null || (userInfo15 = chatListResponse17.getUserInfo()) == null) ? null : userInfo15.getAvatar();
                        ea50 ea50VarP2 = xa50VarF6.f(Drawable.class).P(avatar2);
                        ea50VarP2.getClass();
                        po80 po80Var6 = new po80(xa50VarF6, avatar2, ea50VarP2, lo80.a);
                        po80Var6.a(hb50.E());
                        po80Var6.e(((eb7) d0Var).a);
                        hb50 hb50VarC2 = new hb50().C(new l060(10));
                        hb50VarC2.getClass();
                        hb50 hb50Var2 = hb50VarC2;
                        if (jSONObject.has("gif")) {
                            xa50 xa50VarF7 = com.bumptech.glide.a.f(chatActivity);
                            xa50VarF7.getClass();
                            String string8 = jSONObject.getString("gif");
                            ea50 ea50VarP3 = xa50VarF7.f(Drawable.class).P(string8);
                            ea50VarP3.getClass();
                            po80 po80Var7 = new po80(xa50VarF7, string8, ea50VarP3, lo80.a);
                            po80Var7.a(hb50Var2);
                            po80Var7.f(R.drawable.gif_placeholder);
                            po80Var7.e(((eb7) d0Var).H);
                            return;
                        }
                        return;
                    }
                    return;
                }
                final JSONObject jSONObject5 = new JSONObject(jSONObject.getString("json"));
                eb7 eb7Var3 = (eb7) d0Var;
                ImageView imageView3 = eb7Var3.D;
                TextView textView7 = eb7Var3.e;
                TextView textView8 = eb7Var3.z;
                TextView textView9 = eb7Var3.d;
                eb7Var3.E.setVisibility(0);
                eb7Var3.F.setVisibility(8);
                if (jSONObject5.getBoolean("isBot")) {
                    if (kotlin.text.c.l(str7, "ping pong", true)) {
                        eb7Var3.I.setBackgroundColor(chatActivity.getColor(R.color.chat_bot_background_header));
                        eb7Var3.J.setBackgroundColor(chatActivity.getColor(R.color.chat_bot_background_body));
                        eb7Var3.K.setBackgroundColor(chatActivity.getColor(R.color.chat_bot_background_body));
                        textView9.setText(chatActivity.getString(R.string.ping_pong_Bot));
                    } else if (kotlin.text.c.l(str7, "sporty jet", true)) {
                        textView9.setText("Sporty Jet Bot");
                    } else if (kotlin.text.c.l(str7, "galaxy go", true)) {
                        textView9.setText(chatActivity.getString(R.string.galaxy_go_Bot));
                    } else if (kotlin.text.c.l(str7, "sporty kick", true)) {
                        textView9.setText(chatActivity.getString(R.string.sporty_kick_bot));
                    } else if (kotlin.text.c.l(str7, "sporty cars", true)) {
                        textView9.setText(chatActivity.getString(R.string.sporty_car_bot));
                    } else if (kotlin.text.c.l(str7, "one-punch", true)) {
                        textView9.setText(chatActivity.getString(R.string.one_punch_Bot));
                    } else if (kotlin.text.c.l(str7, "crazy rider", true)) {
                        textView9.setText(chatActivity.getString(R.string.crazy_rider_bot));
                    } else if (kotlin.text.c.l(str7, "sporty skills", true)) {
                        textView9.setText(chatActivity.getString(R.string.sporty_skills_bot));
                    } else {
                        textView9.setText(chatActivity.getString(R.string.hero_bot));
                    }
                    eb7Var3.c.setImageDrawable(chatActivity.getDrawable(R.drawable.bot_avatar));
                    if (jSONObject5.has(EventKeys.ERROR_MESSAGE)) {
                        String string9 = jSONObject5.getString(EventKeys.ERROR_MESSAGE);
                        string9.getClass();
                        HashMap mapI2 = i(string9);
                        HashMap map3 = new HashMap();
                        Set setKeySet3 = mapI2.keySet();
                        setKeySet3.getClass();
                        String str10 = (String) mapI2.get(CollectionsKt.Q(setKeySet3, 0));
                        if (str10 != null) {
                        }
                        Set setKeySet4 = mapI2.keySet();
                        setKeySet4.getClass();
                        String str11 = (String) CollectionsKt.Q(setKeySet4, 0);
                        op5 op5Var3 = op5.a;
                        String strA6 = yk10.a(str11, chatActivity.getString(R.string.sg_chat));
                        String string10 = jSONObject5.getString(EventKeys.ERROR_MESSAGE);
                        string10.getClass();
                        op5Var3.getClass();
                        eb7Var3.w.setText(op5.b(strA6, string10, map3));
                    }
                    eb7Var3.I.setBackgroundColor(chatActivity.getColor(R.color.chat_bot_background_header));
                    eb7Var3.J.setBackgroundColor(chatActivity.getColor(R.color.chat_bot_background_body));
                } else {
                    eb7Var3.I.setBackgroundColor(chatActivity.getColor(R.color.chat_background_header));
                    eb7Var3.J.setBackgroundColor(chatActivity.getColor(R.color.chat_background_body));
                    textView9.setText((list == null || (chatListResponse20 = list.get(i)) == null || (userInfo18 = chatListResponse20.getUserInfo()) == null) ? null : userInfo18.getNickname());
                    xa50 xa50VarF8 = com.bumptech.glide.a.f(chatActivity);
                    xa50VarF8.getClass();
                    String avatar3 = (list == null || (chatListResponse19 = list.get(i)) == null || (userInfo17 = chatListResponse19.getUserInfo()) == null) ? null : userInfo17.getAvatar();
                    po80 po80Var8 = new po80(xa50VarF8, avatar3, na7.a(xa50VarF8, Drawable.class, avatar3), lo80.a);
                    po80Var8.a(hb50.E());
                    po80Var8.e(eb7Var3.c);
                    if (jSONObject5.has(EventKeys.ERROR_MESSAGE)) {
                        eb7Var3.w.setText(jSONObject5.getString(EventKeys.ERROR_MESSAGE));
                    }
                    if (kotlin.text.c.l(str7, "ping pong", true)) {
                        eb7Var3.I.setBackgroundColor(chatActivity.getColor(R.color.chat_background_header));
                        eb7Var3.J.setBackgroundColor(chatActivity.getColor(R.color.chat_background_body));
                        eb7Var3.K.setBackgroundColor(chatActivity.getColor(R.color.chat_background_body));
                    }
                }
                if (jSONObject5.has("nickName")) {
                    TextView textView10 = eb7Var3.y;
                    String string11 = jSONObject5.getString("nickName");
                    if (string11 == null) {
                        string11 = "";
                    }
                    if (string11.length() == 0) {
                        strA3 = "";
                    } else if (string11.length() == 1) {
                        strA3 = tug.a(string11, "***", string11);
                    } else {
                        strA3 = string11.charAt(0) + "***" + string11.charAt(string11.length() - 1);
                    }
                    textView10.setText(strA3);
                }
                if (jSONObject5.has("roundId")) {
                    eb7Var3.B.setText(jSONObject5.getString("roundId"));
                }
                if (jSONObject5.has("stakeAmount")) {
                    str4 = "currency";
                    if (jSONObject5.has(str4)) {
                        TextView textView11 = eb7Var3.C;
                        op5 op5Var4 = op5.a;
                        String string12 = jSONObject5.getString(str4);
                        string12.getClass();
                        op5Var4.getClass();
                        str3 = " ";
                        hu1.b(op5.i(string12), str3, jSONObject5.getString("stakeAmount"), textView11);
                    } else {
                        str3 = " ";
                    }
                } else {
                    str3 = " ";
                    str4 = "currency";
                }
                if (jSONObject5.has(str4) && jSONObject5.has("payoutAmount")) {
                    TextView textView12 = eb7Var3.A;
                    op5 op5Var5 = op5.a;
                    String string13 = jSONObject5.getString(str4);
                    string13.getClass();
                    op5Var5.getClass();
                    hu1.b(op5.i(string13), str3, jSONObject5.getString("payoutAmount"), textView12);
                }
                if (jSONObject5.has("sideBetType") && jSONObject5.has("targetCoefficient")) {
                    double d5 = jSONObject5.getDouble("targetCoefficient");
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(d5);
                    str5 = "x";
                    sb3.append(str5);
                    textView2 = textView8;
                    textView2.setText(sb3.toString());
                    textView = textView7;
                    textView.setTag(chatActivity.getString(R.string.over_under_cms));
                    op5.r(op5.a, kotlin.collections.b.f(textView), null, 4);
                    textView2.setPadding(0, 0, 0, 0);
                    textView2.setBackground(null);
                } else {
                    textView = textView7;
                    textView2 = textView8;
                    str5 = "x";
                }
                if (jSONObject5.has("cashOutCoefficient")) {
                    textView2.setText(jSONObject5.getDouble("cashOutCoefficient") + str5);
                    textView.setTag(chatActivity.getString(R.string.cashed_out_cms));
                    op5.r(op5.a, kotlin.collections.b.f(textView), null, 4);
                    textView2.setPadding(20, 6, 20, 6);
                    Map<Double, Integer> map4 = m18.a;
                    textView2.setBackgroundTintList(o0b.b(chatActivity, m18.a(jSONObject5.getDouble("cashOutCoefficient"))));
                }
                if (jSONObject5.has("startCoefficient") && jSONObject5.has("endCoefficient")) {
                    textView2.setText(jSONObject5.getDouble("startCoefficient") + "x to " + jSONObject5.getDouble("endCoefficient") + str5);
                    textView.setTag(chatActivity.getString(R.string.range_cms));
                    op5.r(op5.a, kotlin.collections.b.f(textView), null, 4);
                    textView2.setPadding(0, 0, 0, 0);
                    textView2.setBackground(null);
                }
                if (jSONObject5.has("roundId")) {
                    String string14 = jSONObject5.getString("roundId");
                    string14.getClass();
                    if (Long.parseLong(string14) == chatActivity.n0) {
                        imageView = imageView3;
                        imageView.setImageTintList(o0b.b(chatActivity, R.color.sg_color_smoke_grey));
                        imageView.setClickable(false);
                        imageView.setEnabled(false);
                    } else {
                        imageView = imageView3;
                        imageView.setImageTintList(o0b.b(chatActivity, R.color.sh_green));
                        imageView.setClickable(true);
                        imageView.setEnabled(true);
                    }
                } else {
                    imageView = imageView3;
                    imageView.setImageTintList(o0b.b(chatActivity, R.color.sh_green));
                    imageView.setClickable(true);
                    imageView.setEnabled(true);
                }
                imageView.setOnClickListener(new View.OnClickListener() { // from class: ma7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) throws JSONException {
                        oa7 oa7Var = this.a;
                        ibs ibsVar = oa7Var.f;
                        ChatActivity chatActivity2 = oa7Var.a;
                        String str12 = oa7Var.c;
                        boolean zL = c.l(str12, "ping pong", true);
                        JSONObject jSONObject6 = jSONObject5;
                        if (zL) {
                            y720 y720Var = oa7Var.e;
                            String strOptString5 = jSONObject6.optString("roundId");
                            strOptString5.getClass();
                            new dt80(chatActivity2, y720Var, ibsVar, strOptString5).a();
                            wz.a("FairnessClicked", "Ping Pong", "Chat");
                            return;
                        }
                        if (c.l(str12, "sporty jet", true) || c.l(str12, "galaxy go", true) || c.l(str12, "crazy rider", true) || c.l(str12, "sporty skills", true) || c.l(str12, "sporty kick", true) || c.l(str12, "sporty cars", true)) {
                            new Intent("fairnessCall").putExtra("roundId", jSONObject6.getString("roundId"));
                            i97 i97Var = oa7Var.i;
                            String string15 = jSONObject6.getString("roundId");
                            string15.getClass();
                            i97Var.invoke(string15);
                            return;
                        }
                        c28 c28Var = oa7Var.d;
                        String string16 = jSONObject6.getString("roundId");
                        string16.getClass();
                        new et80(chatActivity2, c28Var, ibsVar, string16).a();
                        wz.a("FairnessClicked", "Sporty Hero", "Chat");
                    }
                });
                if (jSONObject5.has("avatarUrl")) {
                    chatActivity.getClass();
                    xa50 xa50VarF9 = com.bumptech.glide.a.f(chatActivity);
                    xa50VarF9.getClass();
                    String string15 = jSONObject5.getString("avatarUrl");
                    po80 po80Var9 = new po80(xa50VarF9, string15, na7.a(xa50VarF9, Drawable.class, string15), lo80.a);
                    po80Var9.a(hb50.E());
                    po80Var9.f(R.drawable.placeholder_s);
                    po80Var9.e(eb7Var3.b);
                    op5.r(op5.a, kotlin.collections.b.f(eb7Var3.i, eb7Var3.v, eb7Var3.f, textView), null, 4);
                    return;
                }
                return;
            }
            if (d0Var instanceof b) {
                JSONObject jSONObject6 = new JSONObject(String.valueOf((list == null || (chatListResponse16 = list.get(i)) == null) ? null : chatListResponse16.getJsonBody()));
                if (!jSONObject6.has("jsonBody")) {
                    if (jSONObject6.has("text")) {
                        b bVar = (b) d0Var;
                        bVar.z.setVisibility(8);
                        bVar.A.setVisibility(0);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        spannableStringBuilder3.append((CharSequence) ((list == null || (chatListResponse15 = list.get(i)) == null || (userInfo14 = chatListResponse15.getUserInfo()) == null) ? null : userInfo14.getNickname()));
                        spannableStringBuilder3.append((CharSequence) "  ");
                        spannableStringBuilder3.append((CharSequence) jSONObject6.getString("text"));
                        spannableStringBuilder3.setSpan(new ForegroundColorSpan(chatActivity.getColor(R.color.chat_username)), 0, (list == null || (chatListResponse14 = list.get(i)) == null || (userInfo13 = chatListResponse14.getUserInfo()) == null || (nickname2 = userInfo13.getNickname()) == null) ? 0 : nickname2.length(), 33);
                        bVar.B.setText(spannableStringBuilder3);
                        bVar.C.setVisibility(8);
                        xa50 xa50VarF10 = com.bumptech.glide.a.f(chatActivity);
                        xa50VarF10.getClass();
                        String avatar4 = (list == null || (chatListResponse13 = list.get(i)) == null || (userInfo12 = chatListResponse13.getUserInfo()) == null) ? null : userInfo12.getAvatar();
                        po80 po80Var10 = new po80(xa50VarF10, avatar4, na7.a(xa50VarF10, Drawable.class, avatar4), lo80.a);
                        po80Var10.a(hb50.E());
                        po80Var10.e(bVar.a);
                        return;
                    }
                    if (!jSONObject6.has("json")) {
                        if (jSONObject6.has("gif")) {
                            ((b) d0Var).z.setVisibility(8);
                            ((b) d0Var).A.setVisibility(0);
                            ((b) d0Var).B.setText((list == null || (chatListResponse10 = list.get(i)) == null || (userInfo9 = chatListResponse10.getUserInfo()) == null) ? null : userInfo9.getNickname());
                            ((b) d0Var).B.setTextColor(chatActivity.getColor(R.color.chat_username));
                            xa50 xa50VarF11 = com.bumptech.glide.a.f(chatActivity);
                            xa50VarF11.getClass();
                            String avatar5 = (list == null || (chatListResponse9 = list.get(i)) == null || (userInfo8 = chatListResponse9.getUserInfo()) == null) ? null : userInfo8.getAvatar();
                            ea50 ea50VarP4 = xa50VarF11.f(Drawable.class).P(avatar5);
                            ea50VarP4.getClass();
                            po80 po80Var11 = new po80(xa50VarF11, avatar5, ea50VarP4, lo80.a);
                            po80Var11.a(hb50.E());
                            po80Var11.e(((b) d0Var).a);
                            hb50 hb50VarC3 = new hb50().C(new gv6(), new l060(48));
                            hb50VarC3.getClass();
                            hb50 hb50Var3 = hb50VarC3;
                            if (jSONObject6.has("gif")) {
                                xa50 xa50VarF12 = com.bumptech.glide.a.f(chatActivity);
                                xa50VarF12.getClass();
                                String string16 = jSONObject6.getString("gif");
                                ea50 ea50VarP5 = xa50VarF12.f(Drawable.class).P(string16);
                                ea50VarP5.getClass();
                                po80 po80Var12 = new po80(xa50VarF12, string16, ea50VarP5, lo80.a);
                                po80Var12.a(hb50Var3);
                                po80Var12.f(R.drawable.gif_placeholder);
                                po80Var12.e(((b) d0Var).C);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    JSONObject jSONObject7 = new JSONObject(jSONObject6.getString("json"));
                    b bVar2 = (b) d0Var;
                    bVar2.z.setVisibility(0);
                    bVar2.A.setVisibility(8);
                    if (jSONObject7.getBoolean("isBot")) {
                        if (str7 == null || !StringsKt.M(str7, "punch", false)) {
                            bVar2.d.setText(chatActivity.getString(R.string.sg_rush_bot_name));
                        } else {
                            bVar2.d.setText(chatActivity.getString(R.string.one_punch_Bot));
                        }
                        bVar2.c.setImageDrawable(chatActivity.getDrawable(R.drawable.bot_avatar));
                    } else {
                        bVar2.d.setText((list == null || (chatListResponse12 = list.get(i)) == null || (userInfo11 = chatListResponse12.getUserInfo()) == null) ? null : userInfo11.getNickname());
                        chatActivity.getClass();
                        xa50 xa50VarF13 = com.bumptech.glide.a.f(chatActivity);
                        xa50VarF13.getClass();
                        String avatar6 = (list == null || (chatListResponse11 = list.get(i)) == null || (userInfo10 = chatListResponse11.getUserInfo()) == null) ? null : userInfo10.getAvatar();
                        po80 po80Var13 = new po80(xa50VarF13, avatar6, na7.a(xa50VarF13, Drawable.class, avatar6), lo80.a);
                        po80Var13.a(hb50.E());
                        po80Var13.e(bVar2.c);
                    }
                    if (jSONObject7.has(EventKeys.ERROR_MESSAGE)) {
                        String string17 = jSONObject7.getString(EventKeys.ERROR_MESSAGE);
                        string17.getClass();
                        HashMap mapI3 = i(string17);
                        HashMap map5 = new HashMap();
                        Set setKeySet5 = mapI3.keySet();
                        setKeySet5.getClass();
                        String str12 = (String) mapI3.get(CollectionsKt.Q(setKeySet5, 0));
                        if (str12 != null) {
                        }
                        Set setKeySet6 = mapI3.keySet();
                        setKeySet6.getClass();
                        String str13 = (String) CollectionsKt.Q(setKeySet6, 0);
                        op5 op5Var6 = op5.a;
                        String strA7 = yk10.a(str13, chatActivity.getString(R.string.sg_chat));
                        String string18 = jSONObject7.getString(EventKeys.ERROR_MESSAGE);
                        string18.getClass();
                        op5Var6.getClass();
                        bVar2.e.setText(op5.b(strA7, string18, map5));
                    }
                    if (jSONObject7.has("nickName")) {
                        bVar2.f.setText(jSONObject7.getString("nickName"));
                    }
                    TextView textView13 = bVar2.w;
                    TreeMap treeMap = pw.a;
                    textView13.setText(pw.a(jSONObject7.getString("houseCoefficient")));
                    TextView textView14 = bVar2.y;
                    op5 op5Var7 = op5.a;
                    String string19 = jSONObject7.getString("currency");
                    string19.getClass();
                    op5Var7.getClass();
                    String strI = op5.i(string19);
                    String string20 = jSONObject7.getString("stakeAmount");
                    if (string20 == null) {
                        string20 = "0.00";
                    }
                    hu1.b(strI, " ", pw.a(string20), textView14);
                    TextView textView15 = bVar2.v;
                    String string21 = jSONObject7.getString("currency");
                    string21.getClass();
                    String strI2 = op5.i(string21);
                    String string22 = jSONObject7.getString("payoutAmount");
                    hu1.b(strI2, " ", pw.a(string22 != null ? string22 : "0.00"), textView15);
                    if (jSONObject7.has("cashOutCoefficient")) {
                        bVar2.i.setText(pw.a(String.valueOf(jSONObject7.getDouble("cashOutCoefficient"))));
                        TextView textView16 = bVar2.i;
                        Map<Double, Integer> map6 = m18.a;
                        textView16.setBackgroundTintList(o0b.b(chatActivity, m18.a(jSONObject7.getDouble("cashOutCoefficient"))));
                    }
                    if (jSONObject7.has("avatarUrl")) {
                        chatActivity.getClass();
                        xa50 xa50VarF14 = com.bumptech.glide.a.f(chatActivity);
                        xa50VarF14.getClass();
                        String string23 = jSONObject7.getString("avatarUrl");
                        po80 po80Var14 = new po80(xa50VarF14, string23, na7.a(xa50VarF14, Drawable.class, string23), lo80.a);
                        po80Var14.a(hb50.E());
                        po80Var14.f(R.drawable.placeholder_s);
                        po80Var14.e(bVar2.b);
                    }
                    op5.r(op5Var7, kotlin.collections.b.f(bVar2.F, bVar2.G, bVar2.E, bVar2.D), null, 4);
                    return;
                }
                JSONObject jSONObject8 = new JSONObject(jSONObject6.getString("jsonBody"));
                JSONObject jSONObject9 = new JSONObject(jSONObject6.getString("userInfo"));
                chatActivity.getClass();
                xa50 xa50VarF15 = com.bumptech.glide.a.f(chatActivity);
                xa50VarF15.getClass();
                String string24 = jSONObject9.getString("avatar");
                po80 po80Var15 = new po80(xa50VarF15, string24, na7.a(xa50VarF15, Drawable.class, string24), lo80.a);
                po80Var15.a(hb50.E());
                b bVar3 = (b) d0Var;
                po80Var15.e(bVar3.a);
                if (jSONObject8.has("text")) {
                    CharSequence text2 = bVar3.B.getText();
                    text2.getClass();
                    for (ForegroundColorSpan foregroundColorSpan2 : (ForegroundColorSpan[]) SpannableString.valueOf(text2).getSpans(0, bVar3.B.getText().length(), ForegroundColorSpan.class)) {
                        SpannableString.valueOf(text2).removeSpan(foregroundColorSpan2);
                    }
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                    spannableStringBuilder4.append((CharSequence) jSONObject9.getString("nickname"));
                    spannableStringBuilder4.append((CharSequence) "  ");
                    spannableStringBuilder4.append((CharSequence) jSONObject8.getString("text"));
                    spannableStringBuilder4.setSpan(new ForegroundColorSpan(chatActivity.getColor(R.color.chat_username)), 0, jSONObject9.getString("nickname").length(), 33);
                    bVar3.B.setText(spannableStringBuilder4);
                    bVar3.C.setVisibility(8);
                    bVar3.z.setVisibility(8);
                    bVar3.A.setVisibility(0);
                    return;
                }
                if (!jSONObject8.has("json")) {
                    if (jSONObject8.has("gif")) {
                        ((b) d0Var).z.setVisibility(8);
                        ((b) d0Var).A.setVisibility(0);
                        ((b) d0Var).B.setText(jSONObject9.getString("nickname"));
                        ((b) d0Var).B.setTextColor(chatActivity.getColor(R.color.chat_username));
                        hb50 hb50VarC4 = new hb50().C(new gv6(), new l060(48));
                        hb50VarC4.getClass();
                        hb50 hb50Var4 = hb50VarC4;
                        ((b) d0Var).C.setVisibility(0);
                        if (jSONObject8.has("gif")) {
                            xa50 xa50VarF16 = com.bumptech.glide.a.f(chatActivity);
                            xa50VarF16.getClass();
                            String string25 = jSONObject8.getString("gif");
                            ea50 ea50VarP6 = xa50VarF16.f(Drawable.class).P(string25);
                            ea50VarP6.getClass();
                            po80 po80Var16 = new po80(xa50VarF16, string25, ea50VarP6, lo80.a);
                            po80Var16.a(hb50Var4);
                            po80Var16.f(R.drawable.gif_placeholder);
                            po80Var16.e(((b) d0Var).C);
                            return;
                        }
                        return;
                    }
                    return;
                }
                JSONObject jSONObject10 = new JSONObject(jSONObject8.getString("json"));
                bVar3.z.setVisibility(0);
                bVar3.A.setVisibility(8);
                if (jSONObject10.getBoolean("isBot")) {
                    boolean zL = kotlin.text.c.l(str7, "one-punch", true);
                    TextView textView17 = bVar3.d;
                    if (zL) {
                        textView17.setText(chatActivity.getString(R.string.one_punch_Bot));
                    } else {
                        textView17.setText(chatActivity.getString(R.string.sg_rush_bot_name));
                    }
                    bVar3.c.setImageDrawable(chatActivity.getDrawable(R.drawable.bot_avatar));
                    cls2 = Drawable.class;
                } else {
                    bVar3.d.setText(jSONObject9.getString("nickname"));
                    xa50 xa50VarF17 = com.bumptech.glide.a.f(chatActivity);
                    xa50VarF17.getClass();
                    String string26 = jSONObject9.getString("avatar");
                    cls2 = Drawable.class;
                    po80 po80Var17 = new po80(xa50VarF17, string26, na7.a(xa50VarF17, cls2, string26), lo80.a);
                    po80Var17.a(hb50.E());
                    po80Var17.e(bVar3.c);
                }
                if (jSONObject10.has(EventKeys.ERROR_MESSAGE)) {
                    String string27 = jSONObject10.getString(EventKeys.ERROR_MESSAGE);
                    string27.getClass();
                    HashMap mapI4 = i(string27);
                    HashMap map7 = new HashMap();
                    Set setKeySet7 = mapI4.keySet();
                    setKeySet7.getClass();
                    String str14 = (String) mapI4.get(CollectionsKt.Q(setKeySet7, 0));
                    if (str14 != null) {
                    }
                    Set setKeySet8 = mapI4.keySet();
                    setKeySet8.getClass();
                    String str15 = (String) CollectionsKt.Q(setKeySet8, 0);
                    op5 op5Var8 = op5.a;
                    String strA8 = yk10.a(str15, chatActivity.getString(R.string.sg_chat));
                    String string28 = jSONObject10.getString(EventKeys.ERROR_MESSAGE);
                    string28.getClass();
                    op5Var8.getClass();
                    bVar3.e.setText(op5.b(strA8, string28, map7));
                }
                if (jSONObject10.has("nickName")) {
                    bVar3.f.setText(jSONObject10.getString("nickName"));
                }
                if (jSONObject10.has("houseCoefficient")) {
                    TextView textView18 = bVar3.w;
                    TreeMap treeMap2 = pw.a;
                    textView18.setText(pw.a(jSONObject10.getString("houseCoefficient")));
                }
                TextView textView19 = bVar3.y;
                op5 op5Var9 = op5.a;
                String string29 = jSONObject10.getString("currency");
                string29.getClass();
                op5Var9.getClass();
                String strI3 = op5.i(string29);
                TreeMap treeMap3 = pw.a;
                String string30 = jSONObject10.getString("stakeAmount");
                if (string30 == null) {
                    string30 = "0.00";
                }
                hu1.b(strI3, " ", pw.a(string30), textView19);
                TextView textView20 = bVar3.v;
                String string31 = jSONObject10.getString("currency");
                string31.getClass();
                String strI4 = op5.i(string31);
                String string32 = jSONObject10.getString("payoutAmount");
                hu1.b(strI4, " ", pw.a(string32 != null ? string32 : "0.00"), textView20);
                bVar3.i.setText(pw.a(String.valueOf(jSONObject10.getDouble("cashOutCoefficient"))));
                TextView textView21 = bVar3.i;
                Map<Double, Integer> map8 = m18.a;
                textView21.setBackgroundTintList(o0b.b(chatActivity, m18.a(jSONObject10.getDouble("cashOutCoefficient"))));
                xa50 xa50VarF18 = com.bumptech.glide.a.f(chatActivity);
                xa50VarF18.getClass();
                String string33 = jSONObject10.getString("avatarUrl");
                po80 po80Var18 = new po80(xa50VarF18, string33, na7.a(xa50VarF18, cls2, string33), lo80.a);
                po80Var18.a(hb50.E());
                po80Var18.f(R.drawable.placeholder_s);
                po80Var18.e(bVar3.b);
                op5.r(op5Var9, kotlin.collections.b.f(bVar3.F, bVar3.G, bVar3.E, bVar3.D), null, 4);
                return;
            }
            if (d0Var instanceof a) {
                JSONObject jSONObject11 = new JSONObject(String.valueOf((list == null || (chatListResponse8 = list.get(i)) == null) ? null : chatListResponse8.getJsonBody()));
                if (!jSONObject11.has("jsonBody")) {
                    if (jSONObject11.has("text")) {
                        a aVar = (a) d0Var;
                        aVar.D.setVisibility(8);
                        aVar.E.setVisibility(0);
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                        spannableStringBuilder5.append((CharSequence) ((list == null || (chatListResponse7 = list.get(i)) == null || (userInfo7 = chatListResponse7.getUserInfo()) == null) ? null : userInfo7.getNickname()));
                        spannableStringBuilder5.append((CharSequence) "   ");
                        spannableStringBuilder5.append((CharSequence) jSONObject11.getString("text"));
                        spannableStringBuilder5.setSpan(new ForegroundColorSpan(chatActivity.getColor(R.color.chat_username)), 0, (list == null || (chatListResponse6 = list.get(i)) == null || (userInfo6 = chatListResponse6.getUserInfo()) == null || (nickname = userInfo6.getNickname()) == null) ? 0 : nickname.length(), 33);
                        aVar.F.setText(spannableStringBuilder5);
                        aVar.G.setVisibility(8);
                        xa50 xa50VarF19 = com.bumptech.glide.a.f(chatActivity);
                        xa50VarF19.getClass();
                        String avatar7 = (list == null || (chatListResponse5 = list.get(i)) == null || (userInfo5 = chatListResponse5.getUserInfo()) == null) ? null : userInfo5.getAvatar();
                        po80 po80Var19 = new po80(xa50VarF19, avatar7, na7.a(xa50VarF19, Drawable.class, avatar7), lo80.a);
                        po80Var19.a(hb50.E());
                        po80Var19.e(aVar.a);
                        return;
                    }
                    if (!jSONObject11.has("json")) {
                        if (jSONObject11.has("gif")) {
                            ((a) d0Var).D.setVisibility(8);
                            ((a) d0Var).E.setVisibility(0);
                            ((a) d0Var).F.setText((list == null || (chatListResponse2 = list.get(i)) == null || (userInfo2 = chatListResponse2.getUserInfo()) == null) ? null : userInfo2.getNickname());
                            ((a) d0Var).F.setTextColor(chatActivity.getColor(R.color.chat_username));
                            xa50 xa50VarF20 = com.bumptech.glide.a.f(chatActivity);
                            xa50VarF20.getClass();
                            String avatar8 = (list == null || (chatListResponse = list.get(i)) == null || (userInfo = chatListResponse.getUserInfo()) == null) ? null : userInfo.getAvatar();
                            ea50 ea50VarP7 = xa50VarF20.f(Drawable.class).P(avatar8);
                            ea50VarP7.getClass();
                            po80 po80Var20 = new po80(xa50VarF20, avatar8, ea50VarP7, lo80.a);
                            po80Var20.a(hb50.E());
                            po80Var20.e(((a) d0Var).a);
                            hb50 hb50VarC5 = new hb50().C(new l060(10));
                            hb50VarC5.getClass();
                            hb50 hb50Var5 = hb50VarC5;
                            if (jSONObject11.has("gif")) {
                                xa50 xa50VarF21 = com.bumptech.glide.a.f(chatActivity);
                                xa50VarF21.getClass();
                                String string34 = jSONObject11.getString("gif");
                                ea50 ea50VarP8 = xa50VarF21.f(Drawable.class).P(string34);
                                ea50VarP8.getClass();
                                po80 po80Var21 = new po80(xa50VarF21, string34, ea50VarP8, lo80.a);
                                po80Var21.a(hb50Var5);
                                po80Var21.f(R.drawable.gif_placeholder);
                                po80Var21.e(((a) d0Var).G);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    JSONObject jSONObject12 = new JSONObject(jSONObject11.getString("json"));
                    a aVar2 = (a) d0Var;
                    aVar2.D.setVisibility(0);
                    aVar2.E.setVisibility(8);
                    new SpannableStringBuilder();
                    boolean z = jSONObject12.getBoolean("isBot");
                    TextView textView22 = aVar2.d;
                    if (z) {
                        textView22.setText(chatActivity.getString(R.string.rocket_bot));
                        aVar2.c.setImageDrawable(chatActivity.getDrawable(R.drawable.bot_avatar));
                        if (jSONObject12.has(EventKeys.ERROR_MESSAGE)) {
                            String string35 = jSONObject12.getString(EventKeys.ERROR_MESSAGE);
                            string35.getClass();
                            HashMap mapI5 = i(string35);
                            HashMap map9 = new HashMap();
                            Set setKeySet9 = mapI5.keySet();
                            setKeySet9.getClass();
                            String str16 = (String) mapI5.get(CollectionsKt.Q(setKeySet9, 0));
                            if (str16 != null) {
                            }
                            Set setKeySet10 = mapI5.keySet();
                            setKeySet10.getClass();
                            String str17 = (String) CollectionsKt.Q(setKeySet10, 0);
                            if (str17 != null) {
                                op5 op5Var10 = op5.a;
                                String strA9 = inm.a(str17, chatActivity.getString(R.string.sg_chat));
                                String string36 = jSONObject12.getString(EventKeys.ERROR_MESSAGE);
                                string36.getClass();
                                op5Var10.getClass();
                                strB = op5.b(strA9, string36, map9);
                            } else {
                                strB = null;
                            }
                            aVar2.w.setText(strB);
                        }
                        if (jSONObject12.has("stakeAmount")) {
                            TextView textView23 = aVar2.C;
                            op5 op5Var11 = op5.a;
                            String strOptString5 = jSONObject12.optString("currency");
                            strOptString5.getClass();
                            op5Var11.getClass();
                            hu1.b(op5.i(strOptString5), " ", jSONObject12.getString("stakeAmount"), textView23);
                        }
                        if (jSONObject12.has("payoutAmount")) {
                            TextView textView24 = aVar2.A;
                            op5 op5Var12 = op5.a;
                            String strOptString6 = jSONObject12.optString("currency");
                            strOptString6.getClass();
                            op5Var12.getClass();
                            hu1.b(op5.i(strOptString6), " ", jSONObject12.getString("payoutAmount"), textView24);
                        }
                        aVar2.I.setBackgroundColor(chatActivity.getColor(R.color.chat_bot_background_header));
                        aVar2.J.setBackgroundColor(chatActivity.getColor(R.color.chat_bot_background_body));
                    } else {
                        textView22.setText((list == null || (chatListResponse4 = list.get(i)) == null || (userInfo4 = chatListResponse4.getUserInfo()) == null) ? null : userInfo4.getNickname());
                        chatActivity.getClass();
                        xa50 xa50VarF22 = com.bumptech.glide.a.f(chatActivity);
                        xa50VarF22.getClass();
                        String avatar9 = (list == null || (chatListResponse3 = list.get(i)) == null || (userInfo3 = chatListResponse3.getUserInfo()) == null) ? null : userInfo3.getAvatar();
                        po80 po80Var22 = new po80(xa50VarF22, avatar9, na7.a(xa50VarF22, Drawable.class, avatar9), lo80.a);
                        po80Var22.a(hb50.E());
                        po80Var22.e(aVar2.c);
                        if (jSONObject12.has(EventKeys.ERROR_MESSAGE)) {
                            aVar2.w.setText(jSONObject12.getString(EventKeys.ERROR_MESSAGE));
                        }
                        if (jSONObject12.has("stakeAmount")) {
                            TextView textView25 = aVar2.C;
                            op5 op5Var13 = op5.a;
                            String strOptString7 = jSONObject12.optString("currency");
                            strOptString7.getClass();
                            op5Var13.getClass();
                            hu1.b(op5.i(strOptString7), " ", jSONObject12.getString("stakeAmount"), textView25);
                        }
                        if (jSONObject12.has("payoutAmount")) {
                            TextView textView26 = aVar2.A;
                            op5 op5Var14 = op5.a;
                            String strOptString8 = jSONObject12.optString("currency");
                            strOptString8.getClass();
                            op5Var14.getClass();
                            hu1.b(op5.i(strOptString8), " ", jSONObject12.getString("payoutAmount"), textView26);
                        }
                        aVar2.I.setBackgroundColor(chatActivity.getColor(R.color.chat_background_header));
                        aVar2.J.setBackgroundColor(chatActivity.getColor(R.color.chat_background_body));
                    }
                    if (jSONObject12.has("nickName")) {
                        TextView textView27 = aVar2.y;
                        String string37 = jSONObject12.getString("nickName");
                        if (string37 == null) {
                            string37 = "";
                        }
                        if (string37.length() == 0) {
                            strA = "";
                        } else if (string37.length() == 1) {
                            strA = tug.a(string37, "***", string37);
                        } else {
                            strA = string37.charAt(0) + "***" + string37.charAt(string37.length() - 1);
                        }
                        textView27.setText(strA);
                    }
                    if (jSONObject12.has("roundId")) {
                        aVar2.B.setText(jSONObject12.getString("roundId"));
                    }
                    if (jSONObject12.has("cashOutCoefficient")) {
                        aVar2.z.setText(jSONObject12.getDouble("cashOutCoefficient") + "x");
                        aVar2.e.setTag(chatActivity.getString(R.string.cashed_out_cms));
                        op5.r(op5.a, kotlin.collections.b.f(aVar2.e), null, 4);
                        aVar2.H.setVisibility(8);
                        if (!jSONObject12.getBoolean("isBot")) {
                            aVar2.H.setVisibility(0);
                            pfd pfdVar = fse.a;
                            ej5.c(w5b.a(gku.a), null, null, new c(jSONObject12, aVar2, this, null), 3);
                        }
                    }
                    if (jSONObject12.has("avatarUrl")) {
                        chatActivity.getClass();
                        xa50 xa50VarF23 = com.bumptech.glide.a.f(chatActivity);
                        xa50VarF23.getClass();
                        String string38 = jSONObject12.getString("avatarUrl");
                        po80 po80Var23 = new po80(xa50VarF23, string38, na7.a(xa50VarF23, Drawable.class, string38), lo80.a);
                        po80Var23.a(hb50.E());
                        po80Var23.f(R.drawable.placeholder_s);
                        po80Var23.e(aVar2.b);
                    }
                    op5.r(op5.a, kotlin.collections.b.f(aVar2.i, aVar2.v, aVar2.f, aVar2.e), null, 4);
                    return;
                }
                JSONObject jSONObject13 = new JSONObject(jSONObject11.getString("jsonBody"));
                JSONObject jSONObject14 = new JSONObject(jSONObject11.getString("userInfo"));
                chatActivity.getClass();
                xa50 xa50VarF24 = com.bumptech.glide.a.f(chatActivity);
                xa50VarF24.getClass();
                String string39 = jSONObject14.getString("avatar");
                po80 po80Var24 = new po80(xa50VarF24, string39, na7.a(xa50VarF24, Drawable.class, string39), lo80.a);
                po80Var24.a(hb50.E());
                a aVar3 = (a) d0Var;
                po80Var24.e(aVar3.a);
                if (jSONObject13.has("text")) {
                    CharSequence text3 = aVar3.F.getText();
                    text3.getClass();
                    for (ForegroundColorSpan foregroundColorSpan3 : (ForegroundColorSpan[]) SpannableString.valueOf(text3).getSpans(0, aVar3.F.getText().length(), ForegroundColorSpan.class)) {
                        SpannableString.valueOf(text3).removeSpan(foregroundColorSpan3);
                    }
                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                    spannableStringBuilder6.append((CharSequence) jSONObject14.getString("nickname"));
                    spannableStringBuilder6.append((CharSequence) "   ");
                    spannableStringBuilder6.append((CharSequence) jSONObject13.getString("text"));
                    spannableStringBuilder6.setSpan(new ForegroundColorSpan(chatActivity.getColor(R.color.chat_username)), 0, jSONObject14.getString("nickname").length(), 33);
                    aVar3.F.setText(spannableStringBuilder6);
                    aVar3.G.setVisibility(8);
                    aVar3.D.setVisibility(8);
                    aVar3.E.setVisibility(0);
                    return;
                }
                if (!jSONObject13.has("json")) {
                    if (jSONObject13.has("gif")) {
                        ((a) d0Var).D.setVisibility(8);
                        ((a) d0Var).E.setVisibility(0);
                        ((a) d0Var).F.setText(jSONObject14.getString("nickname"));
                        ((a) d0Var).F.setTextColor(chatActivity.getColor(R.color.chat_username));
                        hb50 hb50VarC6 = new hb50().C(new l060(10));
                        hb50VarC6.getClass();
                        hb50 hb50Var6 = hb50VarC6;
                        ((a) d0Var).G.setVisibility(0);
                        if (jSONObject13.has("gif")) {
                            xa50 xa50VarF25 = com.bumptech.glide.a.f(chatActivity);
                            xa50VarF25.getClass();
                            String string40 = jSONObject13.getString("gif");
                            ea50 ea50VarP9 = xa50VarF25.f(Drawable.class).P(string40);
                            ea50VarP9.getClass();
                            po80 po80Var25 = new po80(xa50VarF25, string40, ea50VarP9, lo80.a);
                            po80Var25.a(hb50Var6);
                            po80Var25.f(R.drawable.gif_placeholder);
                            po80Var25.e(((a) d0Var).G);
                            return;
                        }
                        return;
                    }
                    return;
                }
                JSONObject jSONObject15 = new JSONObject(jSONObject13.getString("json"));
                aVar3.D.setVisibility(0);
                aVar3.E.setVisibility(8);
                new SpannableStringBuilder();
                boolean z2 = jSONObject15.getBoolean("isBot");
                TextView textView28 = aVar3.d;
                if (z2) {
                    textView28.setText(chatActivity.getString(R.string.rocket_bot));
                    aVar3.c.setImageDrawable(chatActivity.getDrawable(R.drawable.bot_avatar));
                    if (jSONObject15.has(EventKeys.ERROR_MESSAGE)) {
                        String string41 = jSONObject15.getString(EventKeys.ERROR_MESSAGE);
                        string41.getClass();
                        HashMap mapI6 = i(string41);
                        HashMap map10 = new HashMap();
                        Set setKeySet11 = mapI6.keySet();
                        setKeySet11.getClass();
                        String str18 = (String) mapI6.get(CollectionsKt.Q(setKeySet11, 0));
                        if (str18 != null) {
                        }
                        Set setKeySet12 = mapI6.keySet();
                        setKeySet12.getClass();
                        String str19 = (String) CollectionsKt.Q(setKeySet12, 0);
                        if (str19 != null) {
                            op5 op5Var15 = op5.a;
                            String strA10 = inm.a(str19, chatActivity.getString(R.string.sg_chat));
                            String string42 = jSONObject15.getString(EventKeys.ERROR_MESSAGE);
                            string42.getClass();
                            op5Var15.getClass();
                            strB2 = op5.b(strA10, string42, map10);
                        } else {
                            strB2 = null;
                        }
                        aVar3.w.setText(strB2);
                    }
                    if (jSONObject15.has("stakeAmount")) {
                        TextView textView29 = aVar3.C;
                        op5 op5Var16 = op5.a;
                        str2 = "currency";
                        String string43 = jSONObject15.getString(str2);
                        string43.getClass();
                        op5Var16.getClass();
                        str = " ";
                        hu1.b(op5.i(string43), str, jSONObject15.getString("stakeAmount"), textView29);
                    } else {
                        str = " ";
                        str2 = "currency";
                    }
                    if (jSONObject15.has("payoutAmount")) {
                        TextView textView30 = aVar3.A;
                        op5 op5Var17 = op5.a;
                        String string44 = jSONObject15.getString(str2);
                        string44.getClass();
                        op5Var17.getClass();
                        hu1.b(op5.i(string44), str, jSONObject15.getString("payoutAmount"), textView30);
                    }
                    aVar3.I.setBackgroundColor(chatActivity.getColor(R.color.chat_bot_background_header));
                    aVar3.J.setBackgroundColor(chatActivity.getColor(R.color.chat_bot_background_body));
                    cls = Drawable.class;
                } else {
                    textView28.setText(jSONObject14.getString("nickname"));
                    xa50 xa50VarF26 = com.bumptech.glide.a.f(chatActivity);
                    xa50VarF26.getClass();
                    String string45 = jSONObject14.getString("avatar");
                    cls = Drawable.class;
                    po80 po80Var26 = new po80(xa50VarF26, string45, na7.a(xa50VarF26, cls, string45), lo80.a);
                    po80Var26.a(hb50.E());
                    po80Var26.e(aVar3.c);
                    if (jSONObject15.has(EventKeys.ERROR_MESSAGE)) {
                        aVar3.w.setText(jSONObject15.getString(EventKeys.ERROR_MESSAGE));
                    }
                    if (jSONObject15.has("stakeAmount")) {
                        TextView textView31 = aVar3.C;
                        op5 op5Var18 = op5.a;
                        String strOptString9 = jSONObject15.optString("currency");
                        strOptString9.getClass();
                        op5Var18.getClass();
                        hu1.b(op5.i(strOptString9), " ", jSONObject15.getString("stakeAmount"), textView31);
                    }
                    if (jSONObject15.has("payoutAmount")) {
                        TextView textView32 = aVar3.A;
                        op5 op5Var19 = op5.a;
                        String strOptString10 = jSONObject15.optString("currency");
                        strOptString10.getClass();
                        op5Var19.getClass();
                        hu1.b(op5.i(strOptString10), " ", jSONObject15.getString("payoutAmount"), textView32);
                    }
                    aVar3.I.setBackgroundColor(chatActivity.getColor(R.color.chat_background_header));
                    aVar3.J.setBackgroundColor(chatActivity.getColor(R.color.chat_background_body));
                }
                TextView textView33 = aVar3.y;
                String strOptString11 = jSONObject15.optString("nickName", "");
                if (strOptString11 == null) {
                    strOptString11 = "";
                }
                if (strOptString11.length() == 0) {
                    strA2 = "";
                } else if (strOptString11.length() == 1) {
                    strA2 = tug.a(strOptString11, "***", strOptString11);
                } else {
                    strA2 = strOptString11.charAt(0) + "***" + strOptString11.charAt(strOptString11.length() - 1);
                }
                textView33.setText(strA2);
                if (jSONObject15.has("roundId")) {
                    aVar3.B.setText(jSONObject15.getString("roundId"));
                }
                if (jSONObject15.has("cashOutCoefficient")) {
                    aVar3.z.setText(jSONObject15.getDouble("cashOutCoefficient") + "x");
                    aVar3.e.setTag(chatActivity.getString(R.string.cashed_out_cms));
                    op5.r(op5.a, kotlin.collections.b.f(aVar3.e), null, 4);
                    aVar3.H.setVisibility(8);
                    if (!jSONObject15.getBoolean("isBot")) {
                        aVar3.H.setVisibility(0);
                        pfd pfdVar2 = fse.a;
                        ej5.c(w5b.a(gku.a), null, null, new d(jSONObject15, aVar3, this, null), 3);
                    }
                }
                if (jSONObject15.has("avatarUrl")) {
                    xa50 xa50VarF27 = com.bumptech.glide.a.f(chatActivity);
                    xa50VarF27.getClass();
                    String string46 = jSONObject15.getString("avatarUrl");
                    po80 po80Var27 = new po80(xa50VarF27, string46, na7.a(xa50VarF27, cls, string46), lo80.a);
                    po80Var27.a(hb50.E());
                    po80Var27.f(R.drawable.placeholder_s);
                    po80Var27.e(aVar3.b);
                }
                op5.r(op5.a, kotlin.collections.b.f(aVar3.i, aVar3.v, aVar3.f, aVar3.e), null, 4);
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i == 0) {
            View viewA = dzc.a(viewGroup, R.layout.chat_item, viewGroup, false);
            viewA.getClass();
            return new eb7(viewA);
        }
        if (i == 1) {
            View viewA2 = dzc.a(viewGroup, R.layout.chat_item_rush, viewGroup, false);
            viewA2.getClass();
            return new b(viewA2);
        }
        if (i != 2) {
            View viewA3 = dzc.a(viewGroup, R.layout.chat_item, viewGroup, false);
            viewA3.getClass();
            return new eb7(viewA3);
        }
        View viewA4 = dzc.a(viewGroup, R.layout.chat_iem_pocketrockets, viewGroup, false);
        viewA4.getClass();
        return new a(viewA4);
    }
}
