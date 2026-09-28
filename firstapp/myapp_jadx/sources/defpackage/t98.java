package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.flexbox.FlexboxLayout;
import com.sporty.android.common_ui.widgets.CircleImageView;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.auth.AccountHelperEntryPoint;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.event.comment.ReplyPanel;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.CommentsData;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.ShareBetData;
import com.sportybet.plugin.realsports.event.comment.prematch.view.PostSocialPanel;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class t98 extends s2 implements AccountHelperEntryPoint {
    public final /* synthetic */ AccountHelperEntryPointImpl a;
    public final ma20 b;
    public final kd20 c;
    public final jgd0 d;
    public final int e;
    public ArrayList f;
    public final Context i;
    public final Pattern v;
    public final mpe0 w;
    public final mpe0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t98(ViewGroup viewGroup, hd20 hd20Var, kd20 kd20Var) {
        super(viewGroup, R.layout.spr_adapter_comment_item_new);
        hd20Var.getClass();
        kd20Var.getClass();
        this.a = new AccountHelperEntryPointImpl();
        this.b = hd20Var;
        this.c = kd20Var;
        View view = this.itemView;
        int i = R.id.comment;
        TextView textView = (TextView) h5e.a(R.id.comment, view);
        if (textView != null) {
            i = R.id.comment_container;
            if (((ConstraintLayout) h5e.a(R.id.comment_container, view)) != null) {
                i = R.id.comment_content_layout;
                View viewA = h5e.a(R.id.comment_content_layout, view);
                if (viewA != null) {
                    igd0 igd0VarA = igd0.a(viewA);
                    i = R.id.comment_item_new_guideline;
                    if (((Guideline) h5e.a(R.id.comment_item_new_guideline, view)) != null) {
                        i = R.id.country_icon;
                        CircleImageView circleImageView = (CircleImageView) h5e.a(R.id.country_icon, view);
                        if (circleImageView != null) {
                            i = R.id.guideline_end;
                            if (((Guideline) h5e.a(R.id.guideline_end, view)) != null) {
                                i = R.id.information_panel;
                                if (((LinearLayout) h5e.a(R.id.information_panel, view)) != null) {
                                    i = R.id.member_icon;
                                    CircleImageView circleImageView2 = (CircleImageView) h5e.a(R.id.member_icon, view);
                                    if (circleImageView2 != null) {
                                        i = R.id.nick_name;
                                        TextView textView2 = (TextView) h5e.a(R.id.nick_name, view);
                                        if (textView2 != null) {
                                            i = R.id.reply_container;
                                            ReplyPanel replyPanel = (ReplyPanel) h5e.a(R.id.reply_container, view);
                                            if (replyPanel != null) {
                                                i = R.id.time;
                                                TextView textView3 = (TextView) h5e.a(R.id.time, view);
                                                if (textView3 != null) {
                                                    i = R.id.txtSeeMore;
                                                    TextView textView4 = (TextView) h5e.a(R.id.txtSeeMore, view);
                                                    if (textView4 != null) {
                                                        i = R.id.view_social_panel;
                                                        PostSocialPanel postSocialPanel = (PostSocialPanel) h5e.a(R.id.view_social_panel, view);
                                                        if (postSocialPanel != null) {
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                            jgd0 jgd0Var = new jgd0(constraintLayout, textView, igd0VarA, circleImageView, circleImageView2, textView2, replyPanel, textView3, textView4, postSocialPanel);
                                                            this.d = jgd0Var;
                                                            this.e = 3;
                                                            this.f = new ArrayList();
                                                            Context context = constraintLayout.getContext();
                                                            context.getClass();
                                                            this.i = context;
                                                            this.v = Pattern.compile("BC[123456789ABCDEFGHJKLMNPQRSTUVWXYZ]+");
                                                            this.w = hwr.b(new m98(0));
                                                            this.y = hwr.b(new n98(0));
                                                            replyPanel.setOnClickListener(new s98(new cq40(), this));
                                                            postSocialPanel.getCount().setOnClickListener(new m43(this, 1));
                                                            postSocialPanel.getReply().setOnClickListener(new n43(this, 1));
                                                            igd0VarA.w.setOnClickListener(new View.OnClickListener() { // from class: q98
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view2) {
                                                                    String shareCode;
                                                                    Object tag = view2.getTag();
                                                                    if (!(tag instanceof CommentsData)) {
                                                                        tag = null;
                                                                    }
                                                                    CommentsData commentsData = (CommentsData) tag;
                                                                    if (commentsData == null || commentsData.getSharedBetsMeta() == null) {
                                                                        return;
                                                                    }
                                                                    ShareBetData shareBetData = (ShareBetData) sh8.b().fromJson(commentsData.getSharedBetsMeta(), ShareBetData.class);
                                                                    if (shareBetData.isAllSettled() || (shareCode = shareBetData.getShareCode()) == null) {
                                                                        shareCode = "";
                                                                    }
                                                                    this.a.b.a(shareBetData.getImageUrl(), shareCode, shareBetData.isAllSettled() ? "" : commentsData.getCountryCode());
                                                                }
                                                            });
                                                            textView4.setOnClickListener(new t43(jgd0Var, 1));
                                                            this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o98
                                                                @Override // android.view.View.OnLongClickListener
                                                                public final boolean onLongClick(View view2) {
                                                                    Object tag = view2.getTag();
                                                                    if (!(tag instanceof CommentsData)) {
                                                                        tag = null;
                                                                    }
                                                                    CommentsData commentsData = (CommentsData) tag;
                                                                    if (commentsData == null) {
                                                                        return false;
                                                                    }
                                                                    t98 t98Var = this.a;
                                                                    t98Var.b.d(commentsData, Intrinsics.g(commentsData.getUserId(), t98Var.a.getAccountHelper().getUserId()));
                                                                    return false;
                                                                }
                                                            });
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.s2
    public final void a(int i) {
        CommentsData commentsData;
        CharSequence charSequence;
        CommentsData commentsData2;
        String strB;
        int i2;
        ShareBetData shareBetData;
        String imageUrl;
        ShareBetData shareBetData2;
        String imageUrl2;
        int i3;
        int i4;
        Object objV = CollectionsKt.V(i, this.f);
        if (!(objV instanceof m88)) {
            objV = null;
        }
        m88 m88Var = (m88) objV;
        if (m88Var == null || (commentsData = m88Var.c) == null) {
            return;
        }
        this.itemView.setTag(commentsData);
        j7g j7gVar = new j7g();
        jgd0 jgd0Var = this.d;
        ReplyPanel replyPanel = jgd0Var.i;
        igd0 igd0Var = jgd0Var.c;
        ConstraintLayout constraintLayout = igd0Var.d;
        ImageView imageView = igd0Var.w;
        PostSocialPanel postSocialPanel = jgd0Var.y;
        CircleImageView circleImageView = jgd0Var.d;
        replyPanel.setTag(new Pair(Integer.valueOf(i), Integer.valueOf(commentsData.getId())));
        TextView textView = jgd0Var.v;
        String createTime = commentsData.getCreateTime();
        Context context = this.i;
        textView.setText(bwf0.k(createTime, sn5.b(context, R.string.comment_details__just_now, new Object[0])));
        postSocialPanel.getCount().setTag(new Pair(Integer.valueOf(i), Integer.valueOf(commentsData.getId())));
        postSocialPanel.getReply().setTag(commentsData);
        jgd0Var.w.setTag(Integer.valueOf(i));
        imageView.setTag(commentsData);
        TextView textView2 = jgd0Var.f;
        if (StringsKt.U(commentsData.getUserNickname())) {
            charSequence = "";
        } else {
            j7gVar.d(commentsData.getUserNickname(), true);
            charSequence = j7gVar;
        }
        textView2.setText(charSequence);
        j7gVar.clear();
        final TextView textView3 = jgd0Var.b;
        if (StringsKt.U(commentsData.getComment())) {
            commentsData2 = commentsData;
            textView3.setVisibility(8);
        } else {
            j7gVar.clear();
            Matcher matcher = this.v.matcher(commentsData.getComment());
            int iEnd = 0;
            while (matcher.find()) {
                int iStart = matcher.start();
                if (iEnd < iStart) {
                    j7gVar.a(commentsData.getComment().substring(iEnd, iStart));
                }
                if (iEnd <= 0 || iEnd != iStart) {
                    iEnd = matcher.end();
                    final String strSubstring = commentsData.getComment().substring(iStart, iEnd);
                    j7gVar.h(strSubstring, Color.parseColor("#0d9737"), new j7g.a() { // from class: p98
                        @Override // j7g.a
                        public final void a() {
                            this.a.c.a(strSubstring, g08.SINGLE_PREMATCH_BET);
                        }
                    });
                } else {
                    iEnd = matcher.end();
                    j7gVar.a(commentsData.getComment().substring(iStart, iEnd));
                }
                commentsData = commentsData;
            }
            commentsData2 = commentsData;
            if (iEnd <= commentsData2.getComment().length() - 1) {
                j7gVar.a(commentsData2.getComment().substring(iEnd));
            }
            textView3.setText(j7gVar);
            textView3.setVisibility(0);
            fec fecVar = fec.a;
            if (fecVar == null) {
                fecVar = new fec();
                fec.a = fecVar;
            }
            textView3.setMovementMethod(fecVar);
            textView3.post(new Runnable() { // from class: k98
                @Override // java.lang.Runnable
                public final void run() {
                    int lineCount = textView3.getLineCount();
                    t98 t98Var = this.a;
                    t98Var.d.w.setVisibility(lineCount >= t98Var.e ? 0 : 8);
                }
            });
        }
        boolean likedByMe = commentsData2.getLikedByMe();
        Drawable drawableA = iwh0.a(context, likedByMe ? R.drawable.spr_voted : R.drawable.spr_vote_up, Color.parseColor(likedByMe ? "#0d9737" : "#9ca0ab"));
        TextView count = postSocialPanel.getCount();
        int likedCount = commentsData2.getLikedCount();
        if (likedCount > 999) {
            strB = "999+";
        } else if (likedCount == 0) {
            Context context2 = count.getContext();
            context2.getClass();
            strB = sn5.b(context2, R.string.common_functions__like, new Object[0]);
        } else {
            Context context3 = count.getContext();
            context3.getClass();
            strB = sn5.b(context3, R.string.comment_details__likes, String.valueOf(likedCount));
        }
        count.setText(strB);
        drawableA.setBounds(0, 0, ((Number) this.w.getValue()).intValue(), ((Number) this.y.getValue()).intValue());
        postSocialPanel.getCount().setCompoundDrawables(drawableA, null, null, null);
        ReplyPanel replyPanel2 = jgd0Var.i;
        List<CommentsData> children = commentsData2.getChildren();
        if (children == null || !children.isEmpty()) {
            i2 = 8;
            replyPanel2.setVisibility(0);
            replyPanel2.setInitialData(commentsData2.getChildren(), commentsData2.getRepliesCount());
        } else {
            i2 = 8;
            replyPanel2.setVisibility(8);
        }
        constraintLayout.getClass();
        constraintLayout.setVisibility(i2);
        String sharedBetsMeta = commentsData2.getSharedBetsMeta();
        if (sharedBetsMeta != null && !StringsKt.U(sharedBetsMeta) && (shareBetData = (ShareBetData) sh8.b().fromJson(commentsData2.getSharedBetsMeta(), ShareBetData.class)) != null && (imageUrl = shareBetData.getImageUrl()) != null && (!StringsKt.U(imageUrl))) {
            constraintLayout.getClass();
            constraintLayout.setVisibility(0);
            String sharedBetsMeta2 = commentsData2.getSharedBetsMeta();
            if (sharedBetsMeta2 != null && !StringsKt.U(sharedBetsMeta2) && (shareBetData2 = (ShareBetData) sh8.b().fromJson(commentsData2.getSharedBetsMeta(), ShareBetData.class)) != null && (imageUrl2 = shareBetData2.getImageUrl()) != null && (!StringsKt.U(imageUrl2))) {
                TextView textView4 = igd0Var.f;
                TextView textView5 = igd0Var.z;
                TextView textView6 = igd0Var.v;
                textView4.setText(sn5.b(context, R.string.comment_details__odds, rt5.b(shareBetData2.getTotalOdds())));
                igd0Var.b.setText(sn5.b(context, R.string.comment_details__max_bonus, rt5.a(shareBetData2)).concat("%"));
                ConstraintLayout constraintLayout2 = igd0Var.c;
                boolean zIsAllSettled = shareBetData2.isAllSettled();
                final String shareCode = shareBetData2.getShareCode();
                if (zIsAllSettled || shareCode == null || StringsKt.U(shareCode)) {
                    i3 = 0;
                    i4 = 8;
                    textView6.setVisibility(8);
                    textView5.setVisibility(8);
                } else {
                    i3 = 0;
                    textView6.setVisibility(0);
                    textView5.setVisibility(0);
                    SpannableString spannableString = new SpannableString(shareCode);
                    spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
                    textView6.setText(spannableString);
                    textView6.setTextColor(constraintLayout2.getContext().getColor(R.color.brand_secondary));
                    Context context4 = constraintLayout2.getContext();
                    context4.getClass();
                    textView5.setText(sn5.b(context4, R.string.comment_details__bet_booking_code, new Object[0]));
                    textView6.setOnClickListener(new View.OnClickListener() { // from class: r98
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.c.a(shareCode, g08.SINGLE_PREMATCH_BET);
                        }
                    });
                    i4 = 8;
                }
                FlexboxLayout flexboxLayout = igd0Var.i;
                String totalOdds = shareBetData2.getTotalOdds();
                flexboxLayout.setVisibility((totalOdds == null || StringsKt.U(totalOdds)) ? i4 : i3);
            }
            sh8.a().a(shareBetData.getImageUrl(), imageView);
        }
        sh8.a().e(commentsData2.getAvatar(), jgd0Var.e, R.drawable.default_avatar, R.drawable.default_avatar);
        CountryCodeName countryCodeNameFromCodeNullable = CountryCodeName.INSTANCE.fromCodeNullable(commentsData2.getUserCountryCode());
        int iA = y7b.a(countryCodeNameFromCodeNullable);
        Integer numValueOf = iA != -1 ? Integer.valueOf(iA) : null;
        if (numValueOf != null) {
            circleImageView.setImageResource(numValueOf.intValue());
        } else if (countryCodeNameFromCodeNullable == null) {
            circleImageView.setImageResource(R.drawable.icon_global_2);
        } else {
            sh8.a().a(y7b.b(countryCodeNameFromCodeNullable), circleImageView);
        }
    }

    @Override // com.sportybet.android.auth.AccountHelperEntryPoint
    public final uqm getAccountHelper() {
        return this.a.getAccountHelper();
    }

    @Override // defpackage.s2
    public final void b() {
    }
}
