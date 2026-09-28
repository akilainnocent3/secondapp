package com.sportygames.speedybingo.data.dto;

import defpackage.o8i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/sportygames/speedybingo/data/dto/SBTicketDTO;", "", "numbers", "", "", "<init>", "(Ljava/util/List;)V", "getNumbers", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "game-speedybingo_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SBTicketDTO {
    public static final int $stable = 8;
    private final List<List<Integer>> numbers;

    /* JADX WARN: Multi-variable type inference failed */
    public SBTicketDTO(List<? extends List<Integer>> list) {
        list.getClass();
        this.numbers = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SBTicketDTO copy$default(SBTicketDTO sBTicketDTO, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sBTicketDTO.numbers;
        }
        return sBTicketDTO.copy(list);
    }

    public final List<List<Integer>> component1() {
        return this.numbers;
    }

    public final SBTicketDTO copy(List<? extends List<Integer>> numbers) {
        numbers.getClass();
        return new SBTicketDTO(numbers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SBTicketDTO) && Intrinsics.g(this.numbers, ((SBTicketDTO) other).numbers);
    }

    public final List<List<Integer>> getNumbers() {
        return this.numbers;
    }

    public int hashCode() {
        return this.numbers.hashCode();
    }

    public String toString() {
        return o8i.a(new StringBuilder("SBTicketDTO(numbers="), this.numbers, ')');
    }
}
