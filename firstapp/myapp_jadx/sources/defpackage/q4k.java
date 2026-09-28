package defpackage;

import com.sporty.android.chat.data.CodeChatChatItemDto;
import com.sporty.android.chat.data.CodeChatLastMessageDto;
import com.sporty.android.chat.data.CodeChatSelectionDto;
import com.sporty.android.chat.data.CodeChatSummaryDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.codeChat.domain.GetCodeChatListUseCase$invoke$2$1", f = "GetCodeChatListUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q4k extends tje0 implements Function2<CodeChatChatItemDto, v1b<? super hv7>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ r4k b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4k(r4k r4kVar, v1b<? super q4k> v1bVar) {
        super(2, v1bVar);
        this.b = r4kVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        q4k q4kVar = new q4k(this.b, v1bVar);
        q4kVar.a = obj;
        return q4kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CodeChatChatItemDto codeChatChatItemDto, v1b<? super hv7> v1bVar) {
        return ((q4k) create(codeChatChatItemDto, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d A[PHI: r15
      0x001d: PHI (r15v16 java.lang.String) = (r15v2 java.lang.String), (r15v17 java.lang.String) binds: [B:12:0x0023, B:8:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:87:0x0130  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        int i;
        ev7 ev7Var;
        String str2;
        dv7 dv7Var;
        CodeChatLastMessageDto lastMessage;
        Integer messageCount;
        CodeChatChatItemDto codeChatChatItemDto = (CodeChatChatItemDto) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String shareCode = codeChatChatItemDto.getShareCode();
        if (shareCode == null) {
            shareCode = codeChatChatItemDto.getOrderId();
            if (shareCode == null) {
                str = "";
            } else {
                str = shareCode;
            }
        } else {
            if (StringsKt.U(shareCode)) {
                shareCode = null;
            }
            if (shareCode == null) {
                shareCode = codeChatChatItemDto.getOrderId();
                if (shareCode == null) {
                    str = "";
                } else {
                    str = shareCode;
                }
            } else {
                str = shareCode;
            }
        }
        List<CodeChatSelectionDto> selections = codeChatChatItemDto.getSelections();
        if (selections == null) {
            selections = m2g.a;
        }
        ArrayList arrayList = new ArrayList(l48.r(selections, 10));
        Iterator<T> it = selections.iterator();
        while (it.hasNext()) {
            arrayList.add(cw7.b((CodeChatSelectionDto) it.next()));
        }
        if (selections.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it2 = selections.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                if (cw7.a((CodeChatSelectionDto) it2.next()) && (i2 = i2 + 1) < 0) {
                    b.p();
                    throw null;
                }
            }
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it3 = selections.iterator();
        while (it3.hasNext()) {
            String strA = rrf.a(((CodeChatSelectionDto) it3.next()).getSportId());
            if (StringsKt.U(strA)) {
                strA = null;
            }
            if (strA != null) {
                arrayList2.add(strA);
            }
        }
        List listA0 = CollectionsKt.A0(CollectionsKt.D0(arrayList2));
        CodeChatSummaryDto codeChatSummary = codeChatChatItemDto.getCodeChatSummary();
        int iIntValue = (codeChatSummary == null || (messageCount = codeChatSummary.getMessageCount()) == null) ? 0 : messageCount.intValue();
        if (iIntValue > 0) {
            CodeChatSummaryDto codeChatSummary2 = codeChatChatItemDto.getCodeChatSummary();
            List<String> recentAvatars = codeChatSummary2 != null ? codeChatSummary2.getRecentAvatars() : null;
            if (recentAvatars == null) {
                recentAvatars = m2g.a;
            }
            CodeChatSummaryDto codeChatSummary3 = codeChatChatItemDto.getCodeChatSummary();
            if (codeChatSummary3 == null || (lastMessage = codeChatSummary3.getLastMessage()) == null) {
                dv7Var = null;
            } else {
                String userNickname = lastMessage.getUserNickname();
                if (userNickname == null) {
                    userNickname = "";
                }
                String text = lastMessage.getText();
                if (text == null) {
                    text = "";
                }
                String avatar = lastMessage.getAvatar();
                dv7Var = new dv7(userNickname, text, avatar != null ? avatar : "", Intrinsics.g(lastMessage.getFollowedByRequester(), Boolean.FALSE));
            }
            ev7Var = new ev7(iIntValue, recentAvatars, dv7Var);
        } else {
            ev7Var = new ev7(0, m2g.a, null);
        }
        ev7 ev7Var2 = ev7Var;
        Integer participants = codeChatChatItemDto.getParticipants();
        int iIntValue2 = participants != null ? participants.intValue() : 0;
        String potentialWinnings = codeChatChatItemDto.getPotentialWinnings();
        if (potentialWinnings == null) {
            str2 = "--";
        } else {
            str2 = StringsKt.U(potentialWinnings) ? null : potentialWinnings;
            if (str2 == null) {
                str2 = "--";
            }
        }
        return new hv7(str, iIntValue2, str2, listA0, i, arrayList.size(), arrayList, ev7Var2);
    }
}
