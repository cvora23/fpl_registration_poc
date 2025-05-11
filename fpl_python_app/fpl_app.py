import json
import aiohttp
import asyncio
from fpl import FPL

async def main():
    async with aiohttp.ClientSession() as session:
        fpl = FPL(session)
        player = await fpl.get_player(302, return_json=True)
    # Pretty print JSON with an indent of 4 spaces
    pretty_json = json.dumps(player, indent=4)
    print(pretty_json)

# Python 3.7+
asyncio.run(main())