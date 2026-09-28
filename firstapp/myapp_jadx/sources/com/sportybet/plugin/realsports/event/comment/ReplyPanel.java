package com.sportybet.plugin.realsports.event.comment;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.google.android.flexbox.FlexboxLayout;
import com.sporty.android.common_ui.widgets.CircleImageView;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.activities.ZoomImageActivity;
import com.sportybet.plugin.realsports.event.comment.ReplyPanel;
import com.sportybet.plugin.realsports.event.comment.ReplyPanel.b.C0429b;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.CommentsData;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.ShareBetData;
import defpackage.bi50;
import defpackage.bs60;
import defpackage.bwf0;
import defpackage.eal;
import defpackage.ema;
import defpackage.f00;
import defpackage.fec;
import defpackage.fte;
import defpackage.g08;
import defpackage.gbn;
import defpackage.gky;
import defpackage.gr0;
import defpackage.hsx;
import defpackage.iwh0;
import defpackage.j7g;
import defpackage.o88;
import defpackage.p1m;
import defpackage.qz3;
import defpackage.rt5;
import defpackage.s2;
import defpackage.sn5;
import defpackage.str;
import defpackage.t8d0;
import defpackage.tit;
import defpackage.uqm;
import defpackage.vgb0;
import defpackage.y7b;
import defpackage.zch0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class ReplyPanel extends p1m {
    public static final /* synthetic */ int T = 0;
    public final TextView H;
    public final RecyclerView I;
    public final PreMatchEventActivity J;
    public final ArrayList K;
    public a L;
    public boolean M;
    public int N;
    public final ema O;
    public uqm P;
    public gbn Q;
    public t8d0 R;
    public str<hsx> S;

    public class a extends bs60<s2> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final int getItemCount() {
            return ReplyPanel.this.K.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final long getItemId(int i) {
            return ((CommentsData) ReplyPanel.this.K.get(i)).getId();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
            ((s2) d0Var).a(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return ReplyPanel.this.new b(viewGroup);
        }
    }

    public class b extends s2 implements View.OnClickListener, View.OnLongClickListener {
        public final TextView A;
        public final TextView B;
        public final TextView C;
        public final FlexboxLayout D;
        public final CircleImageView a;
        public final CircleImageView b;
        public final TextView c;
        public final TextView d;
        public final TextView e;
        public final TextView f;
        public final TextView i;
        public final TextView v;
        public final ImageView w;
        public final ConstraintLayout y;
        public final TextView z;

        public class a implements j7g.a {
            public final /* synthetic */ String a;

            public a(b bVar, String str) {
                this.a = str;
            }

            @Override // j7g.a
            public final void a() {
                int i = ReplyPanel.T;
                g08 g08Var = g08.UNKNOWN;
                f00 f00Var = vgb0.a;
                Map mapSingletonMap = Collections.singletonMap("from", "SINGLE_PREMATCH_BET");
                mapSingletonMap.getClass();
                vgb0.c(AnalyticsEvent.COMMENT_LOAD_BOOKING_CODE, mapSingletonMap, false);
                qz3.k(this.a, "SINGLE_PREMATCH_BET");
            }
        }

        /* JADX INFO: renamed from: com.sportybet.plugin.realsports.event.comment.ReplyPanel$b$b, reason: collision with other inner class name */
        public class C0429b extends fte<bi50<String>> {
            public final /* synthetic */ CommentsData a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;

            public C0429b(CommentsData commentsData, int i, int i2) {
                this.a = commentsData;
                this.b = i;
                this.c = i2;
            }

            @Override // defpackage.zu90
            public final void onError(Throwable th) {
            }

            @Override // defpackage.zu90
            public final void onSuccess(Object obj) {
                bi50 bi50Var = (bi50) obj;
                ReplyPanel replyPanel = ReplyPanel.this;
                if (replyPanel.J.isFinishing() || !bi50Var.a.getIsSuccessful() || bi50Var.b == 0) {
                    return;
                }
                int i = this.b + 1;
                CommentsData commentsData = this.a;
                commentsData.setLikeCount(i);
                commentsData.setLikedByMe(true);
                replyPanel.L.j(this.c);
            }
        }

        public b(ViewGroup viewGroup) {
            super(viewGroup, R.layout.spr_adapter_reply_comment_item);
            this.a = (CircleImageView) this.itemView.findViewById(R.id.icon);
            this.b = (CircleImageView) this.itemView.findViewById(R.id.country_icon);
            this.d = (TextView) this.itemView.findViewById(R.id.comment);
            this.f = (TextView) this.itemView.findViewById(R.id.time);
            TextView textView = (TextView) this.itemView.findViewById(R.id.comments_count);
            this.e = textView;
            textView.setOnClickListener(this);
            this.i = (TextView) this.itemView.findViewById(R.id.nick_name);
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.comments_reply);
            this.v = textView2;
            PreMatchEventActivity preMatchEventActivity = ReplyPanel.this.J;
            Drawable drawableA = gr0.a(preMatchEventActivity, R.drawable.spr_reply);
            drawableA.setBounds(0, 0, zch0.a(preMatchEventActivity, 15), zch0.b(preMatchEventActivity.getResources(), 13));
            textView2.setCompoundDrawables(drawableA, null, null, null);
            textView2.setOnClickListener(this);
            this.itemView.setOnLongClickListener(this);
            this.w = (ImageView) this.itemView.findViewById(R.id.share_img);
            this.y = (ConstraintLayout) this.itemView.findViewById(R.id.comment_content_layout);
            this.C = (TextView) this.itemView.findViewById(R.id.share_result);
            this.C = (TextView) this.itemView.findViewById(R.id.share_result);
            this.B = (TextView) this.itemView.findViewById(R.id.result_booking_code);
            this.z = (TextView) this.itemView.findViewById(R.id.odds);
            this.A = (TextView) this.itemView.findViewById(R.id.bonus);
            this.D = (FlexboxLayout) this.itemView.findViewById(R.id.odds_bonus_container);
            this.c = (TextView) this.itemView.findViewById(R.id.txtSeeMore);
        }

        @Override // defpackage.s2
        public final void a(int i) {
            int i2;
            final ShareBetData shareBetData;
            int iEnd;
            ReplyPanel replyPanel = ReplyPanel.this;
            PreMatchEventActivity preMatchEventActivity = replyPanel.J;
            ArrayList arrayList = replyPanel.K;
            final CommentsData commentsData = arrayList.get(i) != null ? (CommentsData) arrayList.get(i) : null;
            if (commentsData != null) {
                commentsData.getId();
                j7g j7gVar = new j7g();
                boolean zIsEmpty = TextUtils.isEmpty(commentsData.getUserNickname());
                boolean z = true;
                TextView textView = this.i;
                if (zIsEmpty) {
                    textView.setText("");
                } else {
                    j7gVar.d(commentsData.getUserNickname(), true);
                    textView.setText(j7gVar);
                }
                j7gVar.clear();
                boolean zIsEmpty2 = TextUtils.isEmpty(commentsData.getComment());
                TextView textView2 = this.d;
                if (zIsEmpty2) {
                    i2 = 8;
                    textView2.setVisibility(8);
                } else {
                    Matcher matcher = Pattern.compile("BC[123456789ABCDEFGHJKLMNPQRSTUVWXYZ]+").matcher(commentsData.getComment());
                    int i3 = 0;
                    while (matcher.find()) {
                        boolean z2 = z;
                        int iStart = matcher.start();
                        if (i3 < iStart) {
                            j7gVar.a(commentsData.getComment().substring(i3, iStart));
                        }
                        if (i3 <= 0 || i3 != iStart) {
                            iEnd = matcher.end();
                            String strSubstring = commentsData.getComment().substring(iStart, iEnd);
                            j7gVar.h(strSubstring, Color.parseColor("#0d9737"), new a(this, strSubstring));
                        } else {
                            iEnd = matcher.end();
                            j7gVar.a(commentsData.getComment().substring(iStart, iEnd));
                        }
                        i3 = iEnd;
                        z = z2;
                    }
                    if (i3 <= commentsData.getComment().length() - 1) {
                        j7gVar.a(commentsData.getComment().substring(i3));
                    }
                    textView2.setVisibility(0);
                    textView2.setText(j7gVar);
                    fec fecVar = fec.a;
                    if (fecVar == null) {
                        fecVar = new fec();
                        fec.a = fecVar;
                    }
                    textView2.setMovementMethod(fecVar);
                    textView2.post(new Runnable() { // from class: j950
                        @Override // java.lang.Runnable
                        public final void run() {
                            ReplyPanel.b bVar = this.a;
                            int lineCount = bVar.d.getLineCount();
                            TextView textView3 = bVar.c;
                            if (lineCount >= 3) {
                                textView3.setVisibility(0);
                            } else {
                                textView3.setVisibility(8);
                            }
                        }
                    });
                    i2 = 8;
                }
                ConstraintLayout constraintLayout = this.y;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(i2);
                    ImageView imageView = this.w;
                    imageView.setTag(null);
                    imageView.setOnClickListener(null);
                    if (!TextUtils.isEmpty(commentsData.getSharedBetsMeta()) && (shareBetData = (ShareBetData) new eal().e(commentsData.getSharedBetsMeta(), ShareBetData.class)) != null && !TextUtils.isEmpty(shareBetData.getImageUrl())) {
                        replyPanel.Q.a(shareBetData.getImageUrl(), imageView);
                        this.z.setText(sn5.b(preMatchEventActivity, R.string.comment_details__odds, gky.a(rt5.b(shareBetData.getTotalOdds()))));
                        this.A.setText(sn5.b(preMatchEventActivity, R.string.comment_details__max_bonus, rt5.a(shareBetData)).concat("%"));
                        boolean zIsAllSettled = shareBetData.isAllSettled();
                        TextView textView3 = this.C;
                        TextView textView4 = this.B;
                        if (zIsAllSettled) {
                            textView4.setVisibility(8);
                            textView3.setVisibility(8);
                        } else {
                            textView4.setVisibility(0);
                            textView3.setVisibility(0);
                            textView4.setText(shareBetData.getShareCode());
                            textView4.setTextColor(preMatchEventActivity.getResources().getColor(R.color.brand_secondary));
                            textView3.setText(sn5.b(preMatchEventActivity, R.string.comment_details__bet_booking_code, new Object[0]));
                            textView4.setOnClickListener(new com.sportybet.plugin.realsports.event.comment.a(this, shareBetData));
                        }
                        this.D.setVisibility(TextUtils.isEmpty(shareBetData.getTotalOdds()) ? 8 : 0);
                        constraintLayout.setVisibility(0);
                        imageView.setTag(shareBetData.getImageUrl());
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: m950
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                PreMatchEventActivity preMatchEventActivity2 = ReplyPanel.this.J;
                                ShareBetData shareBetData2 = shareBetData;
                                String shareCode = shareBetData2.isAllSettled() ? "" : shareBetData2.getShareCode();
                                String countryCode = shareBetData2.isAllSettled() ? "" : commentsData.getCountryCode();
                                Intent intent = new Intent(preMatchEventActivity2, (Class<?>) ZoomImageActivity.class);
                                intent.putExtra("param_fetch_uri", (String) view.getTag());
                                intent.putExtra("param_booking_code", shareCode);
                                intent.putExtra("param_country_code", countryCode);
                                preMatchEventActivity2.startActivityForResult(intent, 2);
                            }
                        });
                    }
                }
                if (TextUtils.isEmpty(commentsData.getUserNickname())) {
                    textView.setText("");
                } else {
                    textView.setText(commentsData.getUserNickname());
                }
                TextView textView5 = this.e;
                textView5.setVisibility(0);
                TextView textView6 = this.v;
                textView6.setVisibility(0);
                textView6.setOnClickListener(new com.sportybet.plugin.realsports.event.comment.b(this, commentsData));
                this.c.setOnClickListener(new c(this));
                boolean likedByMe = commentsData.getLikedByMe();
                int color = Color.parseColor(likedByMe ? "#0d9737" : "#9ca0ab");
                Drawable drawableA = iwh0.a(preMatchEventActivity, likedByMe ? R.drawable.spr_voted : R.drawable.spr_vote_up, color);
                drawableA.setBounds(0, 0, zch0.a(preMatchEventActivity, 15), zch0.a(preMatchEventActivity, 13));
                textView5.setCompoundDrawables(drawableA, null, null, null);
                textView5.setTextColor(color);
                if (commentsData.getLikedCount() > 999) {
                    textView5.setText("999+");
                } else if (commentsData.getLikedCount() == 0) {
                    textView5.setText(sn5.b(preMatchEventActivity, R.string.common_functions__like, new Object[0]));
                } else {
                    textView5.setText(sn5.b(preMatchEventActivity, R.string.comment_details__likes, String.valueOf(commentsData.getLikedCount())));
                }
                this.itemView.setTag(Integer.valueOf(i));
                textView5.setTag(Integer.valueOf(i));
                this.f.setText(bwf0.k(commentsData.getCreateTime(), sn5.b(preMatchEventActivity, R.string.comment_details__just_now, new Object[0])));
                replyPanel.Q.e(TextUtils.isEmpty(commentsData.getAvatar()) ? null : commentsData.getAvatar(), this.a, R.drawable.default_avatar, R.drawable.default_avatar);
                CountryCodeName countryCodeNameFromCodeNullable = CountryCodeName.fromCodeNullable(commentsData.getCountryCode());
                int iA = y7b.a(countryCodeNameFromCodeNullable);
                CircleImageView circleImageView = this.b;
                if (iA != -1) {
                    circleImageView.setImageResource(iA);
                } else if (countryCodeNameFromCodeNullable == null) {
                    circleImageView.setImageResource(R.drawable.icon_global_2);
                } else {
                    replyPanel.Q.a(y7b.b(countryCodeNameFromCodeNullable), circleImageView);
                }
            }
        }

        @Override // defpackage.s2
        public final void b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            final int iIntValue = ((Integer) view.getTag()).intValue();
            ReplyPanel replyPanel = ReplyPanel.this;
            ArrayList arrayList = replyPanel.K;
            final CommentsData commentsData = (iIntValue < 0 || iIntValue >= arrayList.size()) ? null : (CommentsData) arrayList.get(iIntValue);
            if (view.getId() != R.id.comments_count || commentsData == null || commentsData.getLikedByMe()) {
                return;
            }
            final int likedCount = commentsData.getLikedCount();
            replyPanel.P.demandAccount(replyPanel.J, new tit() { // from class: l950
                @Override // defpackage.tit
                public final void w(Account account, boolean z) {
                    ReplyPanel.b bVar = this.a;
                    ReplyPanel replyPanel2 = ReplyPanel.this;
                    ema emaVar = replyPanel2.O;
                    t8d0 t8d0Var = replyPanel2.R;
                    CommentsData commentsData2 = commentsData;
                    ct90<bi50<String>> ct90VarB = t8d0Var.e(commentsData2.getId()).d(wm70.c).b(va0.a());
                    ReplyPanel.b.C0429b c0429b = bVar.new C0429b(commentsData2, likedCount, iIntValue);
                    ct90VarB.a(c0429b);
                    emaVar.b(c0429b);
                }
            });
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            ReplyPanel replyPanel = ReplyPanel.this;
            PreMatchEventActivity preMatchEventActivity = replyPanel.J;
            if (preMatchEventActivity.getSupportFragmentManager().H("CommentActionFragment") != null) {
                return false;
            }
            int iIntValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = replyPanel.K;
            final CommentsData commentsData = (iIntValue < 0 || iIntValue >= arrayList.size()) ? null : (CommentsData) arrayList.get(iIntValue);
            boolean zEqualsIgnoreCase = commentsData.getUserId().equalsIgnoreCase(replyPanel.P.getUserId());
            o88 o88Var = new o88();
            Bundle bundle = new Bundle();
            bundle.putBoolean("SELF_COMMENT", zEqualsIgnoreCase);
            o88Var.setArguments(bundle);
            o88Var.c = new o88.a() { // from class: k950
                @Override // o88.a
                public final void a(n88 n88Var) {
                    ReplyPanel.this.J.U1(n88Var, commentsData, true);
                }
            };
            o88Var.show(preMatchEventActivity.getSupportFragmentManager(), "CommentActionFragment");
            return false;
        }
    }

    public ReplyPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.K = new ArrayList();
        this.M = true;
        this.N = 0;
        this.O = new ema();
        LayoutInflater.from(context).inflate(R.layout.spr_panel_reply_item, this);
        this.J = (PreMatchEventActivity) context;
        this.H = (TextView) findViewById(R.id.reply_count);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        this.I = recyclerView;
        ((h) recyclerView.getItemAnimator()).g = false;
        recyclerView.getItemAnimator().f = 0L;
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setNestedScrollingEnabled(false);
    }

    private void setReplyCount(int i) {
        TextView textView = this.H;
        if (i <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(sn5.c(textView, R.string.live__replies_prefix, i > 999 ? "999+" : String.valueOf(i)));
            textView.setVisibility(0);
        }
    }

    public void setDataAndUpdate(List<CommentsData> list) {
        int i;
        if (!this.M || list.isEmpty()) {
            i = 10;
        } else {
            list.subList(0, Math.min(list.size(), 2)).clear();
            i = 8;
        }
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        arrayList.addAll(list);
        this.L.k(size, list.size());
        int i2 = this.N - i;
        this.N = i2;
        this.M = false;
        setReplyCount(i2);
    }

    public void setInitialData(List<CommentsData> list, int i) {
        if (this.L == null) {
            a aVar = new a();
            this.L = aVar;
            aVar.setHasStableIds(true);
            this.I.setAdapter(this.L);
        }
        ArrayList arrayList = this.K;
        arrayList.clear();
        this.N = i - 2;
        arrayList.addAll(list);
        this.L.i();
        this.M = true;
        setReplyCount(this.N);
    }

    public ReplyPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReplyPanel(Context context) {
        this(context, null);
    }
}
