package defpackage;

import com.sporty.android.chat.data.CodeChatChatItemDto;
import com.sporty.android.chat.data.CodeChatChatsResponseDto;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class gv7 extends ghb0<Integer, CodeChatChatItemDto> {
    public final jc7 c;
    public final int d;

    public gv7(jc7 jc7Var) {
        jc7Var.getClass();
        this.c = jc7Var;
        this.d = 10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wqz
    public final Object b(xqz xqzVar) {
        wqz.b.c cVarA;
        int iIntValue;
        Integer num = xqzVar.b;
        if (num == null || (cVarA = xqzVar.a(num.intValue())) == null) {
            return null;
        }
        Integer num2 = (Integer) cVarA.b;
        if (num2 != null) {
            iIntValue = num2.intValue() + 1;
        } else {
            Integer num3 = (Integer) cVarA.c;
            if (num3 == null) {
                return null;
            }
            iIntValue = num3.intValue() - 1;
        }
        return Integer.valueOf(iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wqz
    public final Object d(wqz.a aVar, x1b x1bVar) {
        fv7 fv7Var;
        int i;
        if (x1bVar instanceof fv7) {
            fv7Var = (fv7) x1bVar;
            int i2 = fv7Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fv7Var.d = i2 - Integer.MIN_VALUE;
            } else {
                fv7Var = new fv7(this, x1bVar);
            }
        } else {
            fv7Var = new fv7(this, x1bVar);
        }
        Object objA = fv7Var.b;
        y5b y5bVar = y5b.a;
        int i3 = fv7Var.d;
        ssw<lk50<Unit>> sswVar = this.b;
        int iIntValue = this.d;
        try {
            if (i3 == 0) {
                uj50.b(objA);
                Integer num = (Integer) aVar.a();
                int iIntValue2 = num != null ? num.intValue() : 1;
                lk50.b bVar = lk50.b.a;
                bVar.getClass();
                sswVar.j(bVar);
                lyh<CodeChatChatsResponseDto> lyhVarF = this.c.f(iIntValue2, iIntValue);
                fv7Var.a = iIntValue2;
                fv7Var.d = 1;
                objA = s0i.a(lyhVarF, fv7Var);
                if (objA == y5bVar) {
                    return y5bVar;
                }
                i = iIntValue2;
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = fv7Var.a;
                uj50.b(objA);
            }
            CodeChatChatsResponseDto codeChatChatsResponseDto = (CodeChatChatsResponseDto) objA;
            List<CodeChatChatItemDto> items = codeChatChatsResponseDto.getItems();
            if (items == null) {
                items = m2g.a;
            }
            sswVar.j(new lk50.c(Unit.a));
            Integer pageSize = codeChatChatsResponseDto.getPageSize();
            if (pageSize != null) {
                iIntValue = pageSize.intValue();
            }
            return new wqz.b.c(items, i != 1 ? new Integer(i - 1) : null, (!items.isEmpty() && items.size() >= iIntValue) ? new Integer(i + 1) : null, Integer.MIN_VALUE, Integer.MIN_VALUE);
        } catch (Throwable th) {
            sswVar.j(new lk50.a(th));
            return new wqz.b.a(th);
        }
    }
}
