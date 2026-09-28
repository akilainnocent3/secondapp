package com.sportybet.plugin.realsports.event.comment;

import android.accounts.Account;
import android.text.TextUtils;
import android.view.View;
import com.sporty.android.core.model.account.AccountInfo;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.event.comment.ReplyPanel;
import com.sportybet.plugin.realsports.event.comment.b;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.CommentsData;
import defpackage.tit;
import defpackage.uqm;
import defpackage.w8;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements View.OnClickListener {
    public final /* synthetic */ CommentsData a;
    public final /* synthetic */ ReplyPanel.b b;

    public class a implements tit {
        public a() {
        }

        @Override // defpackage.tit
        public final void w(Account account, boolean z) {
            if (account != null) {
                b bVar = b.this;
                uqm uqmVar = ReplyPanel.this.P;
                final CommentsData commentsData = bVar.a;
                uqmVar.loadAccountInfo(new w8() { // from class: n950
                    @Override // defpackage.w8
                    public final void a(AccountInfo accountInfo, String str, String str2) {
                        boolean zIsEmpty = TextUtils.isEmpty(str);
                        ReplyPanel.b bVar2 = b.this.b;
                        if (zIsEmpty) {
                            ReplyPanel.this.S.get().b();
                            return;
                        }
                        PreMatchEventActivity preMatchEventActivity = ReplyPanel.this.J;
                        CommentsData commentsData2 = commentsData;
                        preMatchEventActivity.g2(commentsData2.getParentId().intValue(), commentsData2.getUserNickname(), commentsData2.getUserId().equalsIgnoreCase(ReplyPanel.this.P.getUserId()));
                    }
                });
            }
        }
    }

    public b(ReplyPanel.b bVar, CommentsData commentsData) {
        this.b = bVar;
        this.a = commentsData;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ReplyPanel replyPanel = ReplyPanel.this;
        replyPanel.P.demandAccount(replyPanel.J, new a());
    }
}
