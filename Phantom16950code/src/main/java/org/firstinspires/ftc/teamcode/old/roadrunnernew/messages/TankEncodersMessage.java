package org.firstinspires.ftc.teamcode.old.roadrunnernew.messages;

import com.acmerobotics.roadrunner.ftc.PositionVelocityPair;

import java.util.List;

public final class TankEncodersMessage {
    public long timestamp;
    public PositionVelocityPair[] left;
    public PositionVelocityPair[] right;

    public TankEncodersMessage(List<PositionVelocityPair> left, List<PositionVelocityPair> right) {
        this.timestamp = System.nanoTime();
        this.left = left.toArray(new PositionVelocityPair[0]);
        this.right = right.toArray(new PositionVelocityPair[0]);
    }
}
