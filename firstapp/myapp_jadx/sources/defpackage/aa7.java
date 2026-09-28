package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.x;
import com.google.android.flexbox.FlexboxLayout;
import com.google.protobuf.Reader;
import com.sporty.android.chat.data.CalculateTotalBonus;
import com.sporty.android.chat.data.ChatMessage;
import com.sporty.android.chat.data.LiveShareBetData;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class aa7 extends x<ChatMessage, a> {
    public fd7 b;

    public static final class a extends RecyclerView.d0 {
        public static final /* synthetic */ int c = 0;
        public fd7 a;
        public k2p b;

        public a() {
            throw null;
        }
    }

    public static final class b extends n.e<ChatMessage> {
        @Override // androidx.recyclerview.widget.n.e
        public final boolean areContentsTheSame(ChatMessage chatMessage, ChatMessage chatMessage2) {
            ChatMessage chatMessage3 = chatMessage;
            ChatMessage chatMessage4 = chatMessage2;
            chatMessage3.getClass();
            chatMessage4.getClass();
            return Intrinsics.g(chatMessage3, chatMessage4);
        }

        @Override // androidx.recyclerview.widget.n.e
        public final boolean areItemsTheSame(ChatMessage chatMessage, ChatMessage chatMessage2) {
            ChatMessage chatMessage3 = chatMessage;
            ChatMessage chatMessage4 = chatMessage2;
            chatMessage3.getClass();
            chatMessage4.getClass();
            return chatMessage3.getMessageNo() == chatMessage4.getMessageNo();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        final a aVar = (a) d0Var;
        aVar.getClass();
        ChatMessage item = getItem(i);
        item.getClass();
        final ChatMessage chatMessage = item;
        int length = chatMessage.getUserInfo().getNickname().length();
        k2p k2pVar = aVar.b;
        if (length == 0) {
            if (k2pVar == null) {
                Intrinsics.n("itemChatBinding");
                throw null;
            }
            k2pVar.e.setVisibility(8);
        } else {
            if (k2pVar == null) {
                Intrinsics.n("itemChatBinding");
                throw null;
            }
            k2pVar.e.setVisibility(0);
        }
        if (k2pVar == null) {
            Intrinsics.n("itemChatBinding");
            throw null;
        }
        m2p m2pVar = k2pVar.b;
        ConstraintLayout constraintLayout = m2pVar.a;
        TextView textView = k2pVar.f;
        TextView textView2 = k2pVar.c;
        k2pVar.e.setText(chatMessage.getUserInfo().getNickname());
        textView2.setText(chatMessage.getConversation());
        k2pVar.a.setTag(Integer.valueOf(i));
        textView2.setMaxLines(Reader.READ_DONE);
        textView.setVisibility(8);
        textView.setOnClickListener(new View.OnClickListener() { // from class: w97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k2p k2pVar2 = aVar.b;
                if (k2pVar2 == null) {
                    Intrinsics.n("itemChatBinding");
                    throw null;
                }
                k2pVar2.f.setVisibility(8);
                if (k2pVar2 != null) {
                    k2pVar2.c.setMaxLines(Reader.READ_DONE);
                } else {
                    Intrinsics.n("itemChatBinding");
                    throw null;
                }
            }
        });
        constraintLayout.setVisibility(8);
        final LiveShareBetData shareBetData = chatMessage.getShareBetData();
        if (shareBetData != null) {
            constraintLayout.setVisibility(0);
            ImageView imageView = m2pVar.c;
            TextView textView3 = m2pVar.v;
            TextView textView4 = m2pVar.f;
            imageView.setVisibility(8);
            Context context = aVar.itemView.getContext();
            ImageView imageView2 = m2pVar.i;
            String imageUrl = shareBetData.getImageUrl();
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
            tbn.a(imageView2, imageUrl, false);
            TextView textView5 = m2pVar.d;
            context.getClass();
            textView5.setText(sn5.b(context, R.string.comment_details__odds, gky.a(CalculateTotalBonus.getTotalOdds(shareBetData.getTotalOdds()))));
            m2pVar.b.setText(sn5.b(context, R.string.app_common__blank_space, new Object[0]) + sn5.b(context, R.string.comment_details__max_bonus, CalculateTotalBonus.INSTANCE.getTotalBonus(shareBetData)) + "%");
            if (shareBetData.isAllSettled()) {
                textView4.setVisibility(8);
                textView3.setVisibility(8);
            } else {
                textView4.setVisibility(0);
                textView3.setVisibility(0);
                SpannableString spannableString = new SpannableString(shareBetData.getShareCode());
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
                textView4.setText(spannableString);
                textView4.setTextColor(context.getColor(R.color.brand_secondary));
                textView3.setText(sn5.b(context, R.string.comment_details__bet_booking_code, new Object[0]));
                textView4.setOnClickListener(new View.OnClickListener() { // from class: x97
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        fd7 fd7Var = aVar.a;
                        if (fd7Var != null) {
                            String strValueOf = String.valueOf(shareBetData.getShareCode());
                            chatMessage.getUserInfo().getCountry().getClass();
                            ux4.a aVar2 = new ux4.a();
                            aVar2.a = strValueOf;
                            fd7Var.invoke(aVar2);
                        }
                    }
                });
            }
            m2pVar.w.setOnClickListener(new View.OnClickListener() { // from class: y97
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveShareBetData liveShareBetData = shareBetData;
                    boolean zIsAllSettled = liveShareBetData.isAllSettled();
                    fd7 fd7Var = aVar.a;
                    if (zIsAllSettled) {
                        if (fd7Var != null) {
                            fd7Var.invoke(new ux4.b(liveShareBetData.getImageUrl(), "", ""));
                        }
                    } else if (fd7Var != null) {
                        fd7Var.invoke(new ux4.b(liveShareBetData.getImageUrl(), String.valueOf(liveShareBetData.getShareCode()), chatMessage.getUserInfo().getCountry()));
                    }
                }
            });
            FlexboxLayout flexboxLayout = m2pVar.e;
            String totalOdds = shareBetData.getTotalOdds();
            flexboxLayout.setVisibility((totalOdds == null || StringsKt.U(totalOdds)) ? 8 : 0);
        }
        textView2.getViewTreeObserver().addOnPreDrawListener(new z97(aVar));
        mpe0 mpe0Var = ljs.a;
        ljs.d(k2pVar.d, CountryCodeName.INSTANCE.fromCodeNullable(chatMessage.getUserInfo().getCountry()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        int i2 = a.c;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        layoutInflaterFrom.getClass();
        fd7 fd7Var = this.b;
        View viewInflate = layoutInflaterFrom.inflate(R.layout.item_chat, viewGroup, false);
        int i3 = R.id.comment_content_layout;
        View viewA = h5e.a(R.id.comment_content_layout, viewInflate);
        if (viewA != null) {
            m2p m2pVarA = m2p.a(viewA);
            i3 = R.id.conversation;
            TextView textView = (TextView) h5e.a(R.id.conversation, viewInflate);
            if (textView != null) {
                i3 = R.id.icon_avatar;
                if (((ImageView) h5e.a(R.id.icon_avatar, viewInflate)) != null) {
                    i3 = R.id.icon_country;
                    ImageView imageView = (ImageView) h5e.a(R.id.icon_country, viewInflate);
                    if (imageView != null) {
                        i3 = R.id.layout_conversation;
                        if (((ConstraintLayout) h5e.a(R.id.layout_conversation, viewInflate)) != null) {
                            i3 = R.id.name;
                            TextView textView2 = (TextView) h5e.a(R.id.name, viewInflate);
                            if (textView2 != null) {
                                i3 = R.id.see_more;
                                TextView textView3 = (TextView) h5e.a(R.id.see_more, viewInflate);
                                if (textView3 != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    k2p k2pVar = new k2p(constraintLayout, m2pVarA, textView, imageView, textView2, textView3);
                                    constraintLayout.getClass();
                                    a aVar = new a(constraintLayout);
                                    aVar.b = k2pVar;
                                    aVar.a = fd7Var;
                                    return aVar;
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
        return null;
    }
}
