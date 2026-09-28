package defpackage;

import com.sporty.android.chat.data.CodeChatChatItemDto;
import com.sporty.android.chat.data.CodeChatChatsResponseDto;
import com.sporty.android.chat.data.CodeChatSelectionDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class n4k {
    public final jc7 a;

    public static final class a {
        public static final a d = new a(0, 0, m2g.a);
        public final int a;
        public final int b;
        public final List<dw7> c;

        public a(int i, int i2, List<dw7> list) {
            list.getClass();
            this.a = i;
            this.b = i2;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && Intrinsics.g(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gpp.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            return ng1.a(dy5.a("CodeChatHeaderResult(selectionVisibleCount=", this.a, this.b, ", selectionTotalCount=", ", selectionsPreview="), this.c, ")");
        }
    }

    public n4k(jc7 jc7Var) {
        jc7Var.getClass();
        this.a = jc7Var;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        o4k o4kVar;
        Object bVar;
        Object next;
        String shareCode;
        if (x1bVar instanceof o4k) {
            o4kVar = (o4k) x1bVar;
            int i = o4kVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                o4kVar.d = i - Integer.MIN_VALUE;
            } else {
                o4kVar = new o4k(this, x1bVar);
            }
        } else {
            o4kVar = new o4k(this, x1bVar);
        }
        Object objA = o4kVar.b;
        y5b y5bVar = y5b.a;
        int i2 = o4kVar.d;
        try {
            if (i2 == 0) {
                uj50.b(objA);
                zi50.a aVar = zi50.b;
                lyh<CodeChatChatsResponseDto> lyhVarF = this.a.f(1, 50);
                o4kVar.a = str;
                o4kVar.d = 1;
                objA = s0i.a(lyhVarF, o4kVar);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = o4kVar.a;
                uj50.b(objA);
            }
            bVar = (CodeChatChatsResponseDto) objA;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        CodeChatChatsResponseDto codeChatChatsResponseDto = (CodeChatChatsResponseDto) bVar;
        if (codeChatChatsResponseDto == null) {
            return a.d;
        }
        List<CodeChatChatItemDto> items = codeChatChatsResponseDto.getItems();
        if (items == null) {
            items = m2g.a;
        }
        Iterator<T> it = items.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            CodeChatChatItemDto codeChatChatItemDto = (CodeChatChatItemDto) next;
            shareCode = codeChatChatItemDto.getShareCode();
            if (shareCode == null) {
                shareCode = codeChatChatItemDto.getOrderId();
                if (shareCode == null) {
                    shareCode = "";
                }
            } else {
                if (StringsKt.U(shareCode)) {
                    shareCode = null;
                }
                if (shareCode == null) {
                    shareCode = codeChatChatItemDto.getOrderId();
                    if (shareCode == null) {
                        shareCode = "";
                    }
                }
            }
        } while (!shareCode.equalsIgnoreCase(str));
        CodeChatChatItemDto codeChatChatItemDto2 = (CodeChatChatItemDto) next;
        if (codeChatChatItemDto2 == null) {
            return a.d;
        }
        List<CodeChatSelectionDto> selections = codeChatChatItemDto2.getSelections();
        if (selections == null) {
            selections = m2g.a;
        }
        ArrayList arrayList = new ArrayList(l48.r(selections, 10));
        Iterator<T> it2 = selections.iterator();
        while (it2.hasNext()) {
            arrayList.add(cw7.b((CodeChatSelectionDto) it2.next()));
        }
        int i3 = 0;
        if (!selections.isEmpty()) {
            Iterator<T> it3 = selections.iterator();
            while (it3.hasNext()) {
                if (cw7.a((CodeChatSelectionDto) it3.next()) && (i3 = i3 + 1) < 0) {
                    b.p();
                    throw null;
                }
            }
        }
        return new a(i3, arrayList.size(), arrayList);
    }
}
