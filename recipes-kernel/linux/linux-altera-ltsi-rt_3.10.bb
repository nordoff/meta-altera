DTB_SUBDIR="dts/"

KERNEL_BRANCH ?= "socfpga-${PV}-ltsi-rt"

require recipes-kernel/linux/linux-altera.inc
COMPATIBLE_MACHINE = "(arria5|cyclone5)"

